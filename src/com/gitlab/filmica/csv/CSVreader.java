package com.gitlab.filmica.csv;

import com.gitlab.filmica.model.AgeRating;
import com.gitlab.filmica.model.Movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVreader {

    public static AgeRating convertToEnum(String value) {
        try {
            return AgeRating.valueOf(value);
        } catch (IllegalArgumentException iae) {
            System.err.println("Passed value doesn't match the case of any of the original enum‘s values.");
        }
        return null;
    }

    public static void movies() {
        String line = "";
        String splitBy = ",";
        ArrayList<Movie> movies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/movies.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] movie = line.split(splitBy);
                movies.add(new Movie(movie[0], movie[1], Integer.parseInt(movie[2].trim()), convertToEnum(movie[3].trim())));
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("An attempt to open the file denoted by a specified pathname has failed.");
        } catch (NumberFormatException nfe) {
            System.err.println("Error occurred while parsing movie duration.");
        } catch (IOException ioe) {
            System.err.println("I/O error occurred while performing readLine()");
        }

        System.out.println(movies);

    }

}
