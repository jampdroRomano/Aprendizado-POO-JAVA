/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio15;

public class Ex15 {
    public static void main(String[] args) {
        int numero = 7;
        int min = 1;
        int max = 100;

        System.out.println(numero + " é primo? " + NumeroUtils.isPrimo(numero));
        System.out.println("Fatorial de " + numero + ": " + NumeroUtils.fatorial(numero));
        System.out.println("Número aleatório entre " + min + " e " + max + ": " + NumeroUtils.gerarAleatorio(min, max));
    }
}
