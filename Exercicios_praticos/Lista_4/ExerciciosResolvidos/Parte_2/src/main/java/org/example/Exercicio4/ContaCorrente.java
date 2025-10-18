package org.example.Exercicio4;

class ContaCorrente extends ContaBancaria {
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double taxa = 1.5;
        if (valor + taxa <= saldo) {
            saldo -= (valor + taxa);
        } else {
            System.out.println("Saldo insuficiente para saque na Conta Corrente.");
        }
    }
}
