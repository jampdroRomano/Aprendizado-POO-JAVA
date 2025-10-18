/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio21;

public class Ex21 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("João", "joao@email.com");
        Pedido p1 = new Pedido(c1, 350.75);

        p1.exibirInfo();
    }
}
