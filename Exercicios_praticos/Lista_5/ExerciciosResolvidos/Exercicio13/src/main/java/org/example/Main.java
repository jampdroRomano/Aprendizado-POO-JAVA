package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Character, Integer> letras = new TreeMap<>();

        letras.put('A', 1);
        letras.put('B', 2);
        letras.put('C', 3);
        letras.put('D', 4);
        letras.put('E', 5);
        letras.put('F', 6);
        letras.put('G', 7);
        letras.put('H', 8);
        letras.put('I', 9);
        letras.put('J', 10);

        for (Character letra : letras.keySet()) {
            System.out.println(letra + " -> " + letras.get(letra));
        }

    }
}