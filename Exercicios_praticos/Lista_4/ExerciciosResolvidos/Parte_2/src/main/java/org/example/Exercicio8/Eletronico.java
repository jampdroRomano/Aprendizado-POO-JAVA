package org.example.Exercicio8;

class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, String marca) {
        super(nome, preco);
        this.marca = marca;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Marca: " + marca);
    }
}