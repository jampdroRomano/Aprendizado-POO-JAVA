package org.example.exercicio15;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;
    public static int totalProdutos = 0;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        totalProdutos++;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}
