/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio9;

public class Ex9 {
    public static void main(String[] args) {
        Forma f1 = new Circulo(5);
        Forma f2 = new Retangulo(4, 6);

        System.out.println("Área do Círculo: " + f1.calcularArea());
        System.out.println("Área do Retângulo: " + f2.calcularArea());
    }
}
