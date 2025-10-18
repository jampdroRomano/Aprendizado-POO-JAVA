/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio14;

public class Ex14 {
    public static void main(String[] args) {
        double lado = 5;
        double raio = 3;
        double largura = 4;
        double altura = 6;

        System.out.println("Área do quadrado: " + Geometria.areaQuadrado(lado));
        System.out.println("Área do círculo: " + Geometria.areaCirculo(raio));
        System.out.println("Área do retângulo: " + Geometria.areaRetangulo(largura, altura));
    }
}
