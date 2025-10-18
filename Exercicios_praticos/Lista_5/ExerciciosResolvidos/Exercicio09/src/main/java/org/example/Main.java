package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Character> vogais = new ArrayList<>();

        vogais.add('A');
        vogais.add('E');
        vogais.add('I');
        vogais.add('O');
        vogais.add('U');

        for (Character vogal : vogais) {
            System.out.println(vogal);
        }

    }
}