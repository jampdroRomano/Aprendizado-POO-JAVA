/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio6;

public class Ex6 {
    public static void main(String[] args) {
        LivroFisico lf = new LivroFisico("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, 1200);
        Ebook eb = new Ebook("Clean Code", "Robert C. Martin", 2008, 5.6);

        lf.exibirInfo();
        System.out.println();
        eb.exibirInfo();
    }
}
