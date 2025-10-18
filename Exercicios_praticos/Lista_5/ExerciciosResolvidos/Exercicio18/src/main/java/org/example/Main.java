package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<Character> letras = new LinkedList<>();

        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        letras.add('E');

        for (Character letra : letras) {
            System.out.println(letra);
        }

    }
}