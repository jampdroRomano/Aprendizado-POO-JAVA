/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/


import java.util.Scanner;

public class Exercicio4 {
    public static boolean par() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(par());
    }
}
