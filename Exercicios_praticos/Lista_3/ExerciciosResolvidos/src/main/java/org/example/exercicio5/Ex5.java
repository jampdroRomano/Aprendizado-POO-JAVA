/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio5;

public class Ex5 {
    public static void main(String[] args) {
        // Criando objetos Carro com o construtor
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2022);
        Carro carro3 = new Carro("Ford", "Mustang", 1969);

        // Exibindo as informações
        carro1.exibirInfo();
        carro2.exibirInfo();
        carro3.exibirInfo();
    }
}
