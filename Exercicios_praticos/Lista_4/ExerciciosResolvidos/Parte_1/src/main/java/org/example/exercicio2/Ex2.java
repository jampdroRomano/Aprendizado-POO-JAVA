/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/


package org.example.exercicio2;

enum Cor {
    VERMELHO(255, 0, 0),
    VERDE(0, 255, 0),
    AZUL(0, 0, 255);

    private final int r;
    private final int g;
    private final int b;

    Cor(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public String getRGB() {
        return "(" + r + ", " + g + ", " + b + ")";
    }
}

public class Ex2 {
    public static void main(String[] args) {
        for (Cor cor : Cor.values()) {
            System.out.println(cor + " - RGB: " + cor.getRGB());
        }
    }
}
