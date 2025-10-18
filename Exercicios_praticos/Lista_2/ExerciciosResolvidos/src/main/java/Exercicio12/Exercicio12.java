/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio12 {

    public static boolean compararStrings(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a primeira String: ");
        String primeiraString = scanner.nextLine();

        System.out.println("Insira a segunda String: ");
        String segundaString = scanner.nextLine();

        boolean saoIguais = compararStrings(primeiraString, segundaString);

        if (saoIguais) {
            System.out.println("As Strings sao iguais.");
        } else {
            System.out.println("As Strings sao diferentes.");
        }

        scanner.close();
    }

}
