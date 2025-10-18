/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio16;

public class Ex16 {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cachorro", 3);

        System.out.println("Nome: " + animal1.getNome());
        System.out.println("Idade: " + animal1.getIdade());
        animal1.emitirSom();
    }
}
