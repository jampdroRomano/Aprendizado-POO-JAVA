package org.example.Exercicio5;

class Personagem {
    protected String nome;
    protected int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void receberDano(int dano) {
        vida -= dano;
        if (vida < 0) vida = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVida() {
        return vida;
    }
}
