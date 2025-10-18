/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio14;

public class Ex14 {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 3500, 10);

        produto1.nome = "Smartphone";
        produto1.preco = 2500;
        produto1.quantidade = 15;

        System.out.println("Nome: " + produto1.nome);
        System.out.println("Preço: " + produto1.preco);
        System.out.println("Quantidade: " + produto1.quantidade);
    }
}
