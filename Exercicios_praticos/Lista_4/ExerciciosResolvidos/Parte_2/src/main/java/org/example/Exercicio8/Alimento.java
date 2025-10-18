package org.example.Exercicio8;

class Alimento extends Produto {
    private String dataValidade;

    public Alimento(String nome, double preco, String dataValidade) {
        super(nome, preco);
        this.dataValidade = dataValidade;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Data de Validade: " + dataValidade);
    }
}