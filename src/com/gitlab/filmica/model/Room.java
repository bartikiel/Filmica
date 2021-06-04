package com.gitlab.filmica.model;

public class Room {

    private String name;
    private int numberOfSeats;


    public Room(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Nazwa sali: "+ name + ",\nIlość miejsc: " + numberOfSeats;
    }
}
