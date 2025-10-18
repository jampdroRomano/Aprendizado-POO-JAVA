/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio16 {

    public static boolean verificaTexto(String palavra) {
        return palavra.matches("[a-zA-z]+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = sc.nextLine();

        if (verificaTexto(palavra)) {
            System.out.println("A palavra contem apenas letras");
        } else {
            System.out.println("A palavra contem numeros");
        }

        sc.close();
    }
}
