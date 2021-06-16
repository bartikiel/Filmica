package com.gitlab.filmica.csv;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CSVwriter {
    // To jest Twój poprzedni plik - zmieniłam mu nazwę :)
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter ("movie.csv");
            String content = "Shrek 3";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            Writer w = new FileWriter("room.csv");
            String content = "Sala numer 2";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            Writer w = new FileWriter("showing.csv");
            String content = "Shrek 3, sala 2, miejsc 25";
            w.write(content);
            w.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
