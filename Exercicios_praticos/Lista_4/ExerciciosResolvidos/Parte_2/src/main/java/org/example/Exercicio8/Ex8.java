/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio8;

public class Ex8 {
    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Smartphone", 2500.00, "Samsung");
        Alimento pao = new Alimento("Pão Francês", 0.50, "10/09/2025");

        celular.exibirInfo();
        System.out.println();
        pao.exibirInfo();
    }
}