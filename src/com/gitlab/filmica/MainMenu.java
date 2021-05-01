package com.gitlab.filmica;

import java.util.Scanner;


public class MainMenu {


}


    public void run () {

        // Using Scanner to get input from user
         Scanner input = new Scanner(System.in);

         //User input
        int userInput = -1;

        //Main menu
        System.out.println("Menu: \n"+
                "1- Wyświetl dostępne filmy \n" +
                "2- Przeglądaj repertuar \n" +
                "3- Wyświetl dane kina \n" +
                "4- Panel Admina \n" +
                "5- Wyjdź z programu \n");
        System.out.println("Dokonaj wyboru z powyższych opcji: \n");


        while (userInput != 5) {
            try{
                userInput = input.nextInt();

                switch (userInput) {
                    case 1:
                        System.out.println("Dostępne filmy");
                        break;
                    case 2:
                        System.out.println("Dostępny repertuar"); //Here we need to add reservation option!
                        break;
                    case 3:
                        System.out.println("Kino Filmica sp. z o.o. \n" +  "15-703 Białystok \n" + "ul. Zwycięstwa 14/3 \n" + "tel. 000-000-000 \n ");
                        break;
                    case 4:
                        runAdmin();
                        break;
                    case 5:
                        System.out.println("Do widzenia!");
                        break;
                    default:
                        System.out.println("Wybór " + userInput + " jest niedostępny." + " Proszę wybrać jedną z poniższych opcji: \n" +
                                "Menu: \n"+
                                "1- Wyświetl dostępne filmy \n" +
                                "2- Przeglądaj repertuar \n" + //Here we need to add reservation option!
                                "3- Wyświetl dane kina \n" +
                                "4- Panel Admina \n" +
                                "5- Wyjdź z programu \n" );
                }
            } catch (Exception exception) {
                System.out.println("Niedozwolony wybór. Wybierz jedną z cyfr: \n");
                input.next();
            }
            }
        }


}
