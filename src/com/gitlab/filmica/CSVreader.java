package com.gitlab.filmica;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CSVreader {

    public static void main(String[] args) {
        String line ="";
        String splitBy = ",";
        ArrayList<Movie> movies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("Movie.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] person = line.split(splitBy);
                Movie.add(new Movie(person[0], person[1], Integer.parseInt(person[2]), Long.parseLong(person[3])));
            }
    }
}
