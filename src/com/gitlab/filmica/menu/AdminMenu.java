package com.gitlab.filmica.menu;


import com.gitlab.filmica.actions.MenuActions;

import java.util.Scanner;



public class AdminMenu {
    public static void run () {
        // Using Scanner to get input from user
        Scanner input = new Scanner(System.in);

        // User input
        int userInput = -1;

        //Admin menu
        System.out.println("Panel Administratora: \n" +
                "0- Wyjdź z programu \n" +
                "1- Wróć do menu głównego \n" +
                "2- Pokaż sprzedane bilety \n" +
                "3- Dodaj film \n" +
                "4- Usuń film \n" +
                "5- Edytuj repertuar \n" +
                "6- Przeglądaj repertuar \n");
        System.out.println("Dokonaj wyboru z powyższych opcji: \n");

        while (userInput != 0){
            try{
                userInput = input.nextInt();

                switch (userInput) {
                    case 0:
                        System.out.println("Do widzenia!");
                        System.exit(0);
                    case 1:
                        MainMenu.run();
                        break;
                    case 2:
                        System.out.println("Pokazuję sprzedane bilety");
                        break;
                    case 3:
                        System.out.println("Dodaję film");
                        break;
                    case 4:
                        System.out.println("Usuwam film");
                        break;
                    case 5:
                        System.out.println("Edytuję repertuar");
                        break;
                    case 6:
                        MenuActions.displayRepertoire();
                        break;

                    default:
                        System.out.println("Wybór " + userInput + " jest niedostępny." + " Proszę wybrać jedną z poniższych opcji: \n" +
                                "Menu: \n"+
                                "0- Wyjdź z programu \n" +
                                "1- Wróć do menu głównego \n" +
                                "2- Pokaż sprzedane bilety \n" +
                                "3- Dodaj film \n" +
                                "4- Usuń film \n" +
                                "5- Edytuj repertuar \n" +
                                "6- Przeglądaj repertuar \n");
                }

            }catch (Exception exception) {
                System.out.println("Niedozwolony wybór. Wybierz jedną z cyfr: \n");
                input.next();
            }
        }

}




    }
