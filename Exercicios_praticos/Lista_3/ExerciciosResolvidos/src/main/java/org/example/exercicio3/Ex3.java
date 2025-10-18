/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio3;

public class Ex3 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Chevrolet", "Camaro", 2023);
        Carro carro2 = new Carro("Toyota", "Corolla", 2020);
        Carro carro3 = new Carro("Ford", "Mustang", 1969);

        carro1.exibirInformacoes();
        carro2.exibirInformacoes();
        carro3.exibirInformacoes();
    }
}
