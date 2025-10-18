/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio7;

public class Ex7 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("João", 20, "202501");
        Professor professor = new Professor("Maria", 40, "Matemática");

        aluno.exibirInfo();
        System.out.println();
        professor.exibirInfo();
    }
}