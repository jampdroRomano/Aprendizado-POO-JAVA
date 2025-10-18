package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> cores = new ArrayList<>();

        cores.add("Amarelo");
        cores.add("Azul");
        cores.add("Roxo");
        cores.add("Cinza");
        cores.add("Vermelho");
        cores.add("Preto");
        cores.add("Ambar");

        for (String cor : cores) {
            if (cor.startsWith("A")) {
                System.out.println(cor);
            }
        }

    }
}