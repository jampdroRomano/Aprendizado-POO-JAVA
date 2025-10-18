package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> clientes = new HashMap<>();

        clientes.put(1, "Lucas");
        clientes.put(2, "João");
        clientes.put(3, "Pedro");

        for (Integer codigo : clientes.keySet()) {
            System.out.println(codigo + " -> " + clientes.get(codigo));
        }

    }
}