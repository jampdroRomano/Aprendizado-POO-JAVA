/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio15 {

    public static boolean verificaChar(String palavra) {
        return Character.toUpperCase(palavra.charAt(0)) == 'A';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();

        if (verificaChar(palavra)) {
            System.out.println("A palavra começa com a letra A");
        } else {
            System.out.println("A palavra NÃO começa com a letra A");
        }

        sc.close();
    }

}
