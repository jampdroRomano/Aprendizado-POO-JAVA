package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> clientes = new LinkedList<>();

        clientes.add("Marcos");
        clientes.add("Marcelo");
        clientes.add("Roberto");

        for (String cliente : clientes) {
            System.out.println(cliente);
        }

    }
}