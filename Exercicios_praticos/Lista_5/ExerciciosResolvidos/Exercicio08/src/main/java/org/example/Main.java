package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> numeros = new ArrayList<>();

        numeros.add(14.1248);
        numeros.add(6.148491545);
        numeros.add(7.48545);

        for (Double numero : numeros) {
            System.out.printf("%.2f\n", numero);
        }

    }
}