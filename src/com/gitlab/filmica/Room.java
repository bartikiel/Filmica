package com.gitlab.filmica;

public class Room {

    String name;
    int numberOfSeats;

    //Constructor
    public Room(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
    }

    //Getter Methods
    public String getName() {
        return name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
}
