/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio23;

public class Ex23 {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "2023101", 7.5, 8.0);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Matrícula: " + aluno1.getMatricula());
        System.out.println("Média: " + aluno1.calcularMedia());
    }
}
