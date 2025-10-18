/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio5;

public class Ex5 {
    public static void main(String[] args) {
        double valor = 100;

        for (Moeda moeda : Moeda.values()) {
            System.out.println(valor + " " + moeda + " = R$ " + moeda.converterParaReal(valor));
        }
    }
}
