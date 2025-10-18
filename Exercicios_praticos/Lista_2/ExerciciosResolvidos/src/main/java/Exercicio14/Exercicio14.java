/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio14 {


    public static char retornaChar(String texto){
        return texto.charAt(0);
    }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = sc.nextLine();

        char letra = retornaChar(palavra);
        System.out.println("Primeira letra: " + letra);



        sc.close();

    }
}
