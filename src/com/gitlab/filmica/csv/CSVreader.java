package com.gitlab.filmica.csv;

import com.gitlab.filmica.model.AgeRating;
import com.gitlab.filmica.model.Movie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVreader {
    public static String line = "";
    public static String splitBy = ",";

    public static AgeRating convertToEnum(String value) {
        try {
            return AgeRating.valueOf(value);
        } catch (IllegalArgumentException iae) {
            System.err.println("Przekazana wartość nie odpowiada żadnej z oryginalnych wartości enuma AgeRating.");
        }
        return null;
    }

    public static ArrayList<Movie> movies() {
        ArrayList<Movie> movies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/movies.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] movie = line.split(splitBy);
                movies.add(new Movie(movie[0], movie[1], Integer.parseInt(movie[2].trim()), convertToEnum(movie[3].trim())));
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Próba otwarcia pliku z podanej ścieżki nie powiodła się.");
        } catch (NumberFormatException nfe) {
            System.err.println("Wystąpił błąd podczas zmiany wartości czasu trwania filmu ze String na Integer.");
        } catch (IOException ioe) {
            System.err.println("Wystąpił błąd I/O podczas wykonywania readLine()");
        }

        return movies;
    }

}
