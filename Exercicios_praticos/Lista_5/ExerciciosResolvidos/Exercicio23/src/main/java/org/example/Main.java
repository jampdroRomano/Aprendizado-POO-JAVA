package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        double soma = 0;

        ArrayList<Double> valores = new ArrayList<>();

        valores.add(15.00);
        valores.add(10.25);
        valores.add(5.15);
        valores.add(7.10);

        for (Double valor : valores) {
            soma += valor;
        }

        System.out.println(soma);

    }
}