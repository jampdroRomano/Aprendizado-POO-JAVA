/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio7;

public class Ex7 {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Honda", "Civic", 2019);

        System.out.println("Modelo inicial: " + carro1.getModelo());

        carro1.setModelo("Civic Touring");
        carro1.setAno(2023);

        carro1.exibirInfo();
    }
}
