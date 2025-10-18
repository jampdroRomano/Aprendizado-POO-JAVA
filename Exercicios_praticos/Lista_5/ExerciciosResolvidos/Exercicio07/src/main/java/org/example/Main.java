package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(5);
        numeros.add(7);
        numeros.add(10);
        numeros.add(12);

        for (Integer numero : numeros) {
            System.out.println(numero * 2);
        }

    }
}