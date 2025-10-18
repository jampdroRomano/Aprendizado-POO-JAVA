package org.example.exercicio25;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void verificarDisponibilidade(String nome) {
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto: " + p.getNome() + " - Quantidade: " + p.getQuantidade());
                return;
            }
        }
        System.out.println("Produto não encontrado no estoque.");
    }
}
