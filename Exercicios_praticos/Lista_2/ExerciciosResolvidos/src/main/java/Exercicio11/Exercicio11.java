/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio11 {

    public static int TamanhoString(String texto) {
        return texto.length();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira uma String na qual gostaria de saber o tamanho: ");
        String StringdoUsuario = scanner.nextLine();

        int tamanho = TamanhoString(StringdoUsuario);

        System.out.println("O tamanho da String e: " + tamanho);

        scanner.close();
    }

}
