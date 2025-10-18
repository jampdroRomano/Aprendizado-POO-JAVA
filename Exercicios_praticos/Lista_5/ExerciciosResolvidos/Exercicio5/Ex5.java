package org.example.Exercicio5;

public class Ex5 {
    public static void main(String[] args) {
        String[] palavras = {"Java", "POO", "Arrays"};

        for (int i = palavras.length - 1; i >= 0; i--) {
            System.out.println("Palavra na posição " + i + ": " + palavras[i]);
        }
    }
}