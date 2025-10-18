/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio19;

public class Ex19 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Tobi", 4);
        Gato gato = new Gato("Mimi", 2);

        System.out.println("Cachorro: " + cachorro.getNome() + ", Idade: " + cachorro.getIdade());
        System.out.println("Gato: " + gato.getNome() + ", Idade: " + gato.getIdade());

        cachorro.emitirSom();
        gato.emitirSom();
    }
}
