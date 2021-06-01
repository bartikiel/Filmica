package com.gitlab.filmica.csv;

import com.gitlab.filmica.model.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.*;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class CSVreader {
    public static String line = "";
    public static String splitBy = ",";

    public static void handleFNFexception(String filePath) {
        System.err.println("Próba otwarcia pliku z podanej ścieżki " + filePath + " nie powiodła się.");
    }

    public static void handleNFexception(String filePath) {
        System.err.println("Wystąpił błąd podczas parsowania wartości na Integer z pliku " + filePath);
    }

    public static void handleIOexception(String filePath) {
        System.err.println("Wystąpił błąd I/O podczas wykonywania readLine() na pliku " + filePath);
    }

    public static AgeRating convertToEnum(String value) {
        try {
            return AgeRating.valueOf(value);
        } catch (IllegalArgumentException iae) {
            System.err.println("Przekazana wartość nie odpowiada żadnej z oryginalnych wartości enuma AgeRating.");
            throw iae;
        }
    }

    public static UUID convertToUUID(String value) {
        return UUID.fromString(value);
    }

    public static ArrayList<Movie> movies() {
        ArrayList<Movie> movies = new ArrayList<>();
        String filePath = "data/movies.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                String[] movie = line.split(splitBy);
                movies.add(new Movie(convertToUUID(movie[0]), movie[1], movie[2], Integer.parseInt(movie[3].trim()), convertToEnum(movie[4].trim())));
            }
        } catch (FileNotFoundException fnfe) {
            handleFNFexception(filePath);
        } catch (NumberFormatException nfe) {
            handleNFexception(filePath);
        } catch (IOException ioe) {
            handleIOexception(filePath);
        }
        return movies;
    }

    public static ArrayList<Room> rooms() {
        ArrayList<Room> rooms = new ArrayList<>();
        String filePath = "data/rooms.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                String[] room = line.split(splitBy);
                rooms.add(new Room(room[0], Integer.parseInt(room[1].trim())));
            }
        } catch (FileNotFoundException fnfe) {
            handleFNFexception(filePath);
        } catch (NumberFormatException nfe) {
            handleNFexception(filePath);
        } catch (IOException ioe) {
            handleIOexception(filePath);
        }
        return rooms;
    }

    public static Optional<Movie> getMovie (UUID value) {
        return movies().stream()
                .filter(it -> it.getId().equals(value))
                .findAny();
    }

    public static Optional<Room> getRoom (String value) {
        return rooms().stream()
                .filter(it -> it.getName().equals(value))
                .findAny();
    }

    public static ArrayList<Showing> showings() {
        ArrayList<Showing> showings = new ArrayList<>();
        String filePath = "data/showings.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                String[] showing = line.split(splitBy);
                var movie = getMovie(convertToUUID(showing[1].trim()))
                        .orElseThrow();
                var room = getRoom(showing[2].trim())
                        .orElseThrow();
                showings.add(new Showing(OffsetDateTime.parse(showing[0]), movie, room));
            }
        } catch (FileNotFoundException fnfe) {
            handleFNFexception(filePath);
        } catch (IOException ioe) {
            handleIOexception(filePath);
        }
        return showings;
    }

    public static Collection<Showing> getShowings (LocalDate value) {
        ZoneId zone = ZoneId.of("Europe/Warsaw");
        LocalDateTime thisDay = value.atStartOfDay();
        LocalDateTime nextDay = thisDay.plusDays(1);

        OffsetDateTime thisDayParsed = thisDay.atZone(zone)
                .toOffsetDateTime()
                .withOffsetSameInstant(ZoneOffset.UTC);

        OffsetDateTime nextDayParsed = nextDay.atZone(zone)
                .toOffsetDateTime()
                .withOffsetSameInstant(ZoneOffset.UTC);

        Collection<Showing> showings = showings().stream()
                .filter(it -> it.getDate().isAfter(thisDayParsed) && it.getDate().isBefore(nextDayParsed))
                .collect(Collectors.toList());

        return showings;
    }


    public static ArrayList<Repertoire> repertoire() {
        ArrayList<Repertoire> repertoires = new ArrayList<>();
        String filePath = "data/repertoire.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            while ((line = reader.readLine()) != null) {
                String[] repertoire = line.split(splitBy);
                var showings = getShowings(LocalDate.parse(repertoire[0]));
                repertoires.add(new Repertoire(LocalDate.parse(repertoire[0]), showings));
            }
        } catch (FileNotFoundException fnfe) {
            handleFNFexception(filePath);
        } catch (DateTimeParseException dtpe) {
            System.err.println("Wystąpił błąd podczas parsowania daty na obiekt LocalDate.");
        } catch (IOException ioe) {
            handleIOexception(filePath);
        }
        return repertoires;
    }

}
