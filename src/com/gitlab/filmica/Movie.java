package com.gitlab.filmica;

import java.util.UUID;

public class Movie {

    private UUID id = UUID.randomUUID();
    private String title;
    private String director;
    private int duration;
    private Short ageRating;

    //Constructor
    public Movie(String title, String director, Integer duration, Short ageRating) {
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;
    }

    //Getter Methods
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public Integer getDuration() {
        return duration;
    }

    public Short getAgeRating() {
        return ageRating;
    }
}
