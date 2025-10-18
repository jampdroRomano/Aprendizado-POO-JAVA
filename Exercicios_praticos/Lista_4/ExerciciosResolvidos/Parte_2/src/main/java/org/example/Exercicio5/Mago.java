package org.example.Exercicio5;

class Mago extends Personagem {
    public Mago(String nome, int vida) {
        super(nome, vida);
    }

    public void atacar(Personagem alvo) {
        int dano = 25;
        System.out.println(nome + " lançou magia causando " + dano + " de dano em " + alvo.getNome());
        alvo.receberDano(dano);
    }
}
