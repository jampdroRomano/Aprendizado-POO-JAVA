package org.example.Exercicio4;

public class Ex4 {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 7, 8, 20, 3};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println("Número par na posição " + i + ": " + numeros[i]);
            }
        }
    }
}
