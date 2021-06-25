package com.gitlab.filmica.model;

import com.gitlab.filmica.csv.CSVreader;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.stream.Collectors;

public class Showing {

    private OffsetDateTime date;
    private Movie movie;
    private Room room;


    public Showing(OffsetDateTime date, Movie movie, Room room) {
        this.date = date;
        this.movie = movie;
        this.room = room;
    }


    public OffsetDateTime getDate() {
        return date;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Collection<Showing> getShowingsByDate(LocalDate date) {
        ZoneId zone = ZoneId.of("Europe/Warsaw");
        LocalDateTime thisDay = date.atStartOfDay();
        LocalDateTime nextDay = thisDay.plusDays(1);

        OffsetDateTime thisDayParsed = thisDay.atZone(zone)
                .toOffsetDateTime()
                .withOffsetSameInstant(ZoneOffset.UTC);

        OffsetDateTime nextDayParsed = nextDay.atZone(zone)
                .toOffsetDateTime()
                .withOffsetSameInstant(ZoneOffset.UTC);

        Collection<Showing> showings = CSVreader.showings().stream()
                .filter(it -> it.getDate().isAfter(thisDayParsed) && it.getDate().isBefore(nextDayParsed))
                .collect(Collectors.toList());

        return showings;
    }

    @Override
    public String toString() {
        var formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy HH:mm:ss"));
        return "Termin seansu: "+ formattedDate + "\nSala:\n" + room + "\nFilm:\n" + movie;
    }
}


