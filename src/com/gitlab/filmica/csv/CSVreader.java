package com.gitlab.filmica.csv;

import com.gitlab.filmica.model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Optional;

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

    public static ArrayList<Room> rooms() {
        ArrayList<Room> rooms = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/rooms.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(splitBy);
                rooms.add(new Room(room[0], Integer.parseInt(room[1].trim())));
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Próba otwarcia pliku z podanej ścieżki nie powiodła się.");
        } catch (NumberFormatException nfe) {
            System.err.println("Wystąpił błąd podczas zmiany wartości czasu trwania filmu ze String na Integer.");
        } catch (IOException ioe) {
            System.err.println("Wystąpił błąd I/O podczas wykonywania readLine()");
        }
        return rooms;
    }

    public static ArrayList<Showing> showings() {
        ArrayList<Showing> showings = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("data/showings.csv"))) {
            while ((line = reader.readLine()) != null) {
                String[] showing = line.split(splitBy);
                showings.add(new Showing(OffsetDateTime.parse(showing[0]), new Movie(showing[1], showing[2], Integer.parseInt(showing[3].trim()), convertToEnum(showing[4].trim())), new Room(showing[5], Integer.parseInt(showing[6].trim()))));
            }
        } catch (FileNotFoundException fnfe) {
            System.err.println("Próba otwarcia pliku z podanej ścieżki nie powiodła się.");
        } catch (NumberFormatException nfe) {
            System.err.println("Wystąpił błąd podczas zmiany wartości czasu trwania filmu ze String na Integer.");
        } catch (IOException ioe) {
            System.err.println("Wystąpił błąd I/O podczas wykonywania readLine()");
        }
        return showings;
    }

}
