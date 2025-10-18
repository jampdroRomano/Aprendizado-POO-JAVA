package org.example.exercicio18;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    public void tentarAcessarAtributos() {
        // Acesso direto aos atributos privados da superclasse gera erro
        // nome = "Rex";       // ERRO
        // idade = 4;          // ERRO
    }

    public void emitirSom() {
        System.out.println("Latindo");
    }
}
