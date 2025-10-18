package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Double> decimais = new LinkedList<>();

        decimais.add(5.12);
        decimais.add(12.254);
        decimais.add(1.1202121);
        decimais.add(3.1416);

        for (Double decimal : decimais) {
            System.out.println(decimal);
        }

    }
}