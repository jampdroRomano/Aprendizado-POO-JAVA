package org.example.exercicio3;

public class Carro {
    public String marca;
    public String modelo;
    public int ano;

    Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano);
    }


}
