package com.gitlab.filmica.model;

import com.gitlab.filmica.model.AdminMenu;

import java.util.Scanner;


public class MainMenu {
    public static void run () {

        // Using Scanner to get input from user
        Scanner input = new Scanner(System.in);

        //User input
        int userInput = -1;

        //Main menu
        System.out.println("Menu: \n" +
                "0- Wyjdź z programu\n" +
                "1- Przejdź na panel administratora \n" +
                "2- Wyświetl dane kina \n" +
                "3- Wyświetl dostępne filmy \n" +
                "4- Przeglądaj repertuar \n");

        System.out.println("Dokonaj wyboru z powyższych opcji: \n");

        while (userInput != 0) {
            try{
                userInput = input.nextInt();

                switch (userInput) {
                    case 0:
                        System.out.println("Do widzenia!");
                        System.exit(0);
                        break;
                    case 1:
                        AdminMenu.run();
                        break;
                    case 2:
                        System.out.println("Kino Filmica sp. z o.o. \n" +  "15-703 Białystok \n" + "ul. Zwycięstwa 14/3 \n" + "tel. 000-000-000 \n ");
                        break;
                    case 3:
                        System.out.println("Dostępne filmy");
                        break;
                    case 4:
                        System.out.println("Dostępny repertuar");
                        break;

                    default:
                        System.out.println("Wybór " + userInput + " jest niedostępny." + " Proszę wybrać jedną z poniższych opcji: \n" + "Menu: \n"+
                                "0- Wyjdź z programu\n" +
                                "1- Przejdź na panel administratora \n" +
                                "2- Wyświetl dane kina \n" +
                                "3- Wyświetl dostępne filmy \n" +
                                "4- Przeglądaj repertuar \n");
                }
            } catch (Exception exception) {
                System.out.println("Niedozwolony wybór. Wybierz jedną z cyfr: \n");
                input.next();
            }
        }
    }

}





