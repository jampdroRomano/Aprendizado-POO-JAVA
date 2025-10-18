package org.example.Exercicio10;

abstract class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    // Método polimórfico
    public abstract double calcularPagamento();
}
