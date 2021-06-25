package com.gitlab.filmica.actions;

import com.gitlab.filmica.csv.CSVreader;
import com.gitlab.filmica.model.Repertoire;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuActions {

    public static void displayRepertoire() {
        ArrayList<Repertoire> fullRepertoire = CSVreader.repertoire();
        //fullRepertoire.forEach(System.out::println);
        ArrayList<LocalDate> allDates = new ArrayList<>();
        Integer index = 1;

        for (Repertoire element : fullRepertoire)
        {
            allDates.add(element.getDate());
        }

        System.out.println("Wybierz jedną z dat aby zobaczyć repertuar na dany dzień:");
        for (LocalDate element : allDates) {
            String formattedDate = element.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
            System.out.println("data numer " + index + ": " + formattedDate);
            index++;
        }
        System.out.println("Wpisz numer aby wybrać datę: ");

        // Using Scanner to get input from user
        Scanner input = new Scanner(System.in);

        // User input
        int userDate = -1;

        try{
            userDate = input.nextInt();
//            var showings = getShowingsByDate(allDates[index-1]);

        } catch (Exception exception) {
            System.out.println("Niedozwolony wybór. Wpisz numer widoczny obok daty aby wybrać datę: \n");
            for (LocalDate element : allDates) {
                String formattedDate = element.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
                System.out.println("data numer " + index + ": " + formattedDate);
            }
            input.next();
        }


    }
}
