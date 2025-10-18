/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio25;

public class Ex25 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 5);
        Produto p2 = new Produto("Smartphone", 10);

        Estoque estoque = new Estoque();
        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);

        estoque.verificarDisponibilidade("Notebook");
        estoque.verificarDisponibilidade("Tablet");
    }
}
