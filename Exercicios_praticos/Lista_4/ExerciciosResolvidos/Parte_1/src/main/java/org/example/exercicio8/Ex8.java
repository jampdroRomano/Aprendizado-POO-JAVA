/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio8;

public class Ex8 {
    public static void main(String[] args) {
        for (Naipe naipe : Naipe.values()) {
            System.out.println(naipe + " - Símbolo: " + naipe.getSimbolo());
        }
    }
}
