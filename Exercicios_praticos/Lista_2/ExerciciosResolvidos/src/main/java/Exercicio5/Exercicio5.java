/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/


import java.util.Scanner;

public class Exercicio5 {
    public static double absoluto() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n = sc.nextDouble();
        if (n < 0) {
            n = -n;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(absoluto());
    }
}
