package com.gitlab.filmica.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collection;

public class Repertoire {
    private LocalDate date;
    private Collection<Showing> showings;

    public Repertoire(LocalDate date, Collection<Showing> showings) {
        this.date = date;
        this.showings = showings;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Collection<Showing> getShowing() {
        return showings;
    }

    public void addShowing(Showing showing) {
        this.showings.add(showing);
    }

    @Override
    public String toString() {
        var formattedDate = date.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        StringBuilder allShowings = new StringBuilder();
        if (showings.size() > 0) {
            for(Showing showing : showings) {
                allShowings.append(showing.toString()+ "\n\n");
            }
        } else {
            allShowings.append("Brak seansów." + "\n\n");
        }

        String ret = "Repertuar na dzień: "+ formattedDate + "\nSeanse:\n\n" + allShowings;

        return ret;
    }
}
