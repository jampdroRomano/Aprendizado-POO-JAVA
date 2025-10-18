package org.example.Exercicio1;

class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + quantidadeDePortas);
        System.out.println("----------------------");
    }
}