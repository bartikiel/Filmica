package com.gitlab.filmica;

import java.time.OffsetDateTime;

public class Showing {

    OffsetDateTime date;
    Movie movie;
    Room room;

    //Constructor
    public Showing(OffsetDateTime date, Movie movie, Room room) {
        this.date = date;
        this.movie = movie;
        this.room = room;
    }

    //Getters methods
    public OffsetDateTime getDate() {
        return date;
    }

    public Movie getMovie() {
        return movie;
    }

    public Room getRoom() {
        return room;
    }
}
