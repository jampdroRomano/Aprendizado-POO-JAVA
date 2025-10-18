/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio9 {

    public static double somarPositivos(double a, double b) {
        if (a > 0 && b > 0) {
            return a + b;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();

        double resultado = somarPositivos(numero1, numero2);

        System.out.println("O resultado da soma e: " + resultado);

        scanner.close();
    }

}
