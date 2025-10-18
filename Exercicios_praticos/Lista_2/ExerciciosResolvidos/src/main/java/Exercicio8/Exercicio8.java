/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

import java.util.Scanner;

public class Exercicio8 {

    public static boolean estaintervalo(int num) {
        return num >= 1 && num <= 100; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero a ser verificado: ");
        int numero = scanner.nextInt();
        
        if (estaintervalo (numero)) {
         System.out.println( numero + " esta no intervalo entre 1 a 100.");
        } else {
            System.out.println( numero + " nao esta no interva entre 1 a 100.");
        }
        
        scanner.close();
    }
}
