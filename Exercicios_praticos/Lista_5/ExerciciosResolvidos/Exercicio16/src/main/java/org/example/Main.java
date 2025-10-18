package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> nomes = new LinkedList<>();

        nomes.add("Lucas");
        nomes.add("Gabriel");
        nomes.add("Pedro");
        nomes.add("João");
        nomes.add("Marta");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}