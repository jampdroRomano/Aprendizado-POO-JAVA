package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}