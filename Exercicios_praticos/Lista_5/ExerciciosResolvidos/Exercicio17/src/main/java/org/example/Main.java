package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Integer> numeros = new LinkedList<>();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for (Integer numero : numeros) {
            System.out.println(numero);
        }

    }
}