package org.example.Exercicio4;

class ContaPoupanca extends ContaBancaria {
    public ContaPoupanca(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        double bonus = valor * 0.01;
        saldo += valor + bonus;
    }
}