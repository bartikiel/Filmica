package com.gitlab.filmica;


import java.util.Scanner;



public class AdminMenu extends MainMenu {

}


    public void runAdmin () {
        // Using Scanner to get input from user
        Scanner input = new Scanner(System.in);

        // User input

        int userInput = -1;

        //Admin menu
        System.out.println("Menu: \n"+
                "1- Dodaj film \n" +
                "2- Usuń film \n" + //Here we need to add reservation option!
                "3- Edytur repertuar \n" +
                "4- Pokaż sprzedane bilety \n" +
                "5- Wróć do menu usera \n" +
                "6- Wyjdź z programu \n");
        System.out.println("Dokonaj wyboru z powyższych opcji: \n");



        while (userInput! = 6){
            try{
                userInput = input.nextInt();

                switch (userInput) {
                    case 1:
                        System.out.println("Dodaję film");
                        break;
                    case 2:
                        System.out.println("Usuwam film");
                        break;
                    case 3:
                        System.out.println("Edytuję repertuar");
                        break;
                    case 4:
                        System.out.println("Pokazuję sprzedane bilety");
                        break;
                    case 5:
                        System.out.println("Menu usera");
                        break;
                    case 6:
                        System.out.println("Do widzenia!");
                        break;
                    default:
                    System.out.println("Wybór " + userInput + " jest niedostępny." + " Proszę wybrać jedną z poniższych opcji: \n" +
                                    "Menu: \n"+
                                    "1- Dodaj film \n" +
                                    "2- Usuń film \n" +
                                    "3- Edytur repertuar \n" +
                                    "4- Pokaż sprzedane bilety \n" +
                                    "5- Wróć do menu usera \n" +
                                    "6- Wyjdź z programu \n");
                }

            }catch (Exception exception) {
                System.out.println("Niedozwolony wybór. Wybierz jedną z cyfr: \n");
                input.next();
            }
        }

    }
}