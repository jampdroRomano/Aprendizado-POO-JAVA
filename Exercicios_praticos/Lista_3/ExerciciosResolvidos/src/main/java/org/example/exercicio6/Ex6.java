/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio6;

public class Ex6 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Carro criado: "
                + carro1.getMarca() + " "
                + carro1.getModelo() + " ("
                + carro1.getAno() + ")");

        carro1.setAno(2023);
        carro1.setModelo("Corolla Cross");

        carro1.exibirInfo();
    }
}
