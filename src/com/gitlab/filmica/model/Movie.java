package com.gitlab.filmica.model;

import java.util.UUID;

public class Movie {

    private UUID id = UUID.randomUUID();
    private String title;
    private String director;
    private int duration;
    private AgeRating ageRating;

    public Movie( UUID id, String title, String director, int duration, AgeRating ageRating ) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.duration = duration;
        this.ageRating = ageRating;

    }

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

    public String  getAgeRating(){
        return ageRating.getDescription();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setAgeRating(AgeRating ageRating) {
        this.ageRating = ageRating;
    }

    @Override
    public String toString() {
        return "ID: "+ id + ",\nTytuł: " + title + ",\nReżyser: " + director + ",\nCzas trwania: " + duration + "min,\nKlasyfikacja wiekowa: " + ageRating + " - " + ageRating.getDescription();
    }
}
