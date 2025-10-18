/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio4;

public class Ex4 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);

        cc.depositar(500);
        cc.sacar(200);

        cp.depositar(500);
        cp.sacar(200);

        System.out.println("Saldo Conta Corrente: R$" + cc.getSaldo());
        System.out.println("Saldo Conta Poupança: R$" + cp.getSaldo());
    }
}
