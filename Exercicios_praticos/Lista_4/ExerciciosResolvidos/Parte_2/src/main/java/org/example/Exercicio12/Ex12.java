/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio12;

public class Ex12 {
    public static void main(String[] args) {
        InstrumentoMusical i1 = new Violao();
        InstrumentoMusical i2 = new Piano();

        i1.tocar();
        i2.tocar();
    }
}