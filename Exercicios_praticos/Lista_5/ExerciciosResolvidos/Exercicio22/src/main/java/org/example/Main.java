package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> frutas = new ArrayList<>();

        frutas.add("Maçã");
        frutas.add("Manga");
        frutas.add("Banana");
        frutas.add("Melancia");

        for (String fruta : frutas) {
            System.out.println(fruta);
        }

    }
}