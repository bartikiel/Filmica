package com.gitlab.filmica.model;

import java.time.LocalDate;

public class Repertoire {
    private LocalDate date;
    private Showing showing;

    public Repertoire(LocalDate date, Showing showing) {
        this.date = date;
        this.showing = showing;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Showing getShowing() {
        return showing;
    }

    public void setShowing(Showing showing) {
        this.showing = showing;
    }
}
