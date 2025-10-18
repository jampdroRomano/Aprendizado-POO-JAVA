/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio13 {


    public static boolean verificaseEhVogal(char caractere) {
        char caractereMinusculo = Character.toLowerCase(caractere);

        return caractereMinusculo == 'a'
                || caractereMinusculo == 'e'
                || caractereMinusculo == 'i'
                || caractereMinusculo == 'o'
                || caractereMinusculo == 'u';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira um caractere: ");
        String insereCaractere = scanner.nextLine();

        if (insereCaractere.length() != 1) {
            System.out.println("Insira apenas um caractere.");
        } else {
            char caractere = insereCaractere.charAt(0);

            boolean resultado = verificaseEhVogal(caractere);

            if (resultado) {
                System.out.println("O caractere '" + caractere + "' é uma vogal.");
            } else {
                System.out.println("O caractere '" + caractere + "' não é uma vogal.");
            }
        }

        scanner.close();
    }
}
