/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio10 {

    public static boolean QuadradoPerfeito(int numero) {
        if (numero < 0) {
            return false;
        }

        for (int i = 0; i * i <= numero; i++) {
            int quadrado = i * i;

            if (quadrado == numero) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();

        boolean resultado = QuadradoPerfeito(numero);

        if (resultado) {
            System.out.println(numero + " e um quadrado perfeito!");
        } else {
            System.out.println(numero + " nao e um quadrado perfeito.");
        }

        scanner.close();
    }

}
