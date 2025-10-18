package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> idades = new TreeMap<>();

        idades.put("Lucas", 17);
        idades.put("João", 18);
        idades.put("Marcelo", 26);
        idades.put("Gabriel", 14);

        for (String nome : idades.keySet()) {
            System.out.println("Nome: " + nome + " | Idade: " + idades.get(nome));
        }

    }
}