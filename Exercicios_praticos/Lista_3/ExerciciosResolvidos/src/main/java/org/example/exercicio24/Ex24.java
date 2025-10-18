/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio24;

public class Ex24 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("João", 1000);

        conta1.exibirInfo();

        conta1.depositar(500);
        System.out.println("Após depósito: R$ " + conta1.getSaldo());

        conta1.sacar(200);
        System.out.println("Após saque: R$ " + conta1.getSaldo());

        conta1.sacar(2000); // Tentativa de saque maior que o saldo
        conta1.exibirInfo();
    }
}
