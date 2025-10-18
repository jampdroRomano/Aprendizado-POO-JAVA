/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio18;

public class Ex18 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 4);

        cachorro.emitirSom();
        cachorro.setNome("Buddy");
        cachorro.setIdade(5);

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Idade: " + cachorro.getIdade());
    }
}
