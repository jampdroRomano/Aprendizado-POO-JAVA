/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio9;

public class Ex9 {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 20, 1.75);

        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("Altura: " + pessoa1.getAltura());

        System.out.println("-----------------------");

        pessoa1.setNome("Maria");
        pessoa1.setIdade(25);
        pessoa1.setAltura(1.68);

        pessoa1.exibirInfo();
    }
}
