/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio17 {

    public static String trocaTexto(String palavra) {
      return palavra.replace('a', '@');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um texto:");
        String palavra = sc.nextLine();

        String textoTrocado = trocaTexto(palavra);

        System.out.println(textoTrocado);

        sc.close();
    }
}
