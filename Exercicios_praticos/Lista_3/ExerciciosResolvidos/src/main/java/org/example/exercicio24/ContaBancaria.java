package org.example.exercicio24;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("-----------------------");
    }
}
