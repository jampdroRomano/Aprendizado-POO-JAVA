/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio6;

public class Ex6 {
    public static void main(String[] args) {
        double valorCompra = 100;

        for (TipoPagamento tipo : TipoPagamento.values()) {
            System.out.println(tipo + " - Valor com desconto: R$ " + tipo.calcularDesconto(valorCompra));
        }
    }
}
