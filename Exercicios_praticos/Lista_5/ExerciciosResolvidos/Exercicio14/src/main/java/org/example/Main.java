package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Double> produtos = new HashMap<>();

        produtos.put("Arroz", 32.99);
        produtos.put("Feijão", 16.79);
        produtos.put("Tomate KG", 7.89);
        produtos.put("Açúcar", 12.99);

        for (String produto : produtos.keySet()) {
            System.out.printf(produto + ": R$%.2f\n", produtos.get(produto));
        }

    }
}