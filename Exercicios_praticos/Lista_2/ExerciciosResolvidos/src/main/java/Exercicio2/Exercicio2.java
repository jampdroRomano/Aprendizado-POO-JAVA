/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/


import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = sc.nextInt();

        System.out.println("O maior número é " + maiorNumero(n1, n2));

        sc.close();
    }

    public static int maiorNumero(int a, int b) {
        return (a > b) ? a : b;
    }
}
