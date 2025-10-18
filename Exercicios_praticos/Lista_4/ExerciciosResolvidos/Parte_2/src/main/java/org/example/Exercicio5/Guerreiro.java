package org.example.Exercicio5;

class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida) {
        super(nome, vida);
    }

    public void atacar(Personagem alvo) {
        int dano = 20;
        System.out.println(nome + " atacou com espada causando " + dano + " de dano em " + alvo.getNome());
        alvo.receberDano(dano);
    }
}
