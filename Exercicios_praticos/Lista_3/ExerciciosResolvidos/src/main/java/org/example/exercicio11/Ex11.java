/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio11;

public class Ex11 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500, 10);

        produto1.exibirInfo();

        produto1.adicionarEstoque(5);
        System.out.println("Após adicionar estoque: " + produto1.getQuantidade());

        produto1.removerEstoque(8);
        System.out.println("Após remover estoque: " + produto1.getQuantidade());

        produto1.removerEstoque(10);
        produto1.exibirInfo();
    }
}
