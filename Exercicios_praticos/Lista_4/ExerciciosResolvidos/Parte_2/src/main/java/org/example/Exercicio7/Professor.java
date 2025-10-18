package org.example.Exercicio7;

class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Disciplina: " + disciplina);
    }
}