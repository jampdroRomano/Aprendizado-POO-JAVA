package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("João Pedro");
        nomes.add("Maria");
        nomes.add("Rafael");
        nomes.add("Daniela");

        for (String nome : nomes) {
            System.out.println(nome);
        }

    }
}