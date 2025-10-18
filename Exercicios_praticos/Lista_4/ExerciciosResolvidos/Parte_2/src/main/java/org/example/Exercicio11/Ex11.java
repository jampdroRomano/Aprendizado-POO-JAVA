/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio11;

public class Ex11 {
    public static void main(String[] args) {
        Transporte t1 = new Carro();
        Transporte t2 = new Bicicleta();
        Transporte t3 = new Aviao();

        t1.mover();
        t2.mover();
        t3.mover();
    }
}
