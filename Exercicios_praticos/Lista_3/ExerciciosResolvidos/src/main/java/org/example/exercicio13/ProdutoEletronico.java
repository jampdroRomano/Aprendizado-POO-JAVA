package org.example.exercicio13;

public class ProdutoEletronico extends Produto {

    public ProdutoEletronico(String nome, double preco, int quantidade, int codigo) {
        super(nome, preco, quantidade, codigo);
    }

    public void exibirCodigo() {
        System.out.println("Código do produto: " + codigo);
    }
}
