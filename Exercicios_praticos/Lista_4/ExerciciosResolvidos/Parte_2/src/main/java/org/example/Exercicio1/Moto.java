package org.example.Exercicio1;

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("----------------------");
    }
}