/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio15;

public class Ex15 {
    public static void main(String[] args) {
        Produto p1 = new Produto("Notebook", 3500, 10);
        Produto p2 = new Produto("Smartphone", 2500, 15);
        Produto p3 = new Produto("Tablet", 1800, 5);

        System.out.println("Total de produtos: " + Produto.totalProdutos);
    }
}
