package com.gitlab.filmica;

import com.gitlab.filmica.csv.CSVreader;
import com.gitlab.filmica.menu.MainMenu;

public class Main {

    public static void main(String[] args) {
//        MainMenu.run();
//        CSVreader.movies().forEach(System.out::println);
        CSVreader.showings().forEach(System.out::println);
    }
}
