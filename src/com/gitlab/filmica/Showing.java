package com.gitlab.filmica;

import java.time.OffsetDateTime;

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
}
