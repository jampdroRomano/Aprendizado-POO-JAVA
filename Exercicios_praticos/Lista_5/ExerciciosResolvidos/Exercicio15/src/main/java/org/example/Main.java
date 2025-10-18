package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> alunos = new TreeMap<>();

        alunos.put(1, "Lucas");
        alunos.put(2, "Gabriel");
        alunos.put(3, "Rafael");

        for (Integer codigo : alunos.keySet()) {
            System.out.println(codigo + " -> " + alunos.get(codigo));
        }

    }
}