package org.example.exercicio11;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Estoque insuficiente!");
        }
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

    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("-----------------------");
    }
}
