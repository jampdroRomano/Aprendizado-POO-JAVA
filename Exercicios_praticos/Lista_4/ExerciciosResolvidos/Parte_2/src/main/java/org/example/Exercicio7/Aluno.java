package org.example.Exercicio7;

class Aluno extends Pessoa {
    private String matricula;

    public Aluno(String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Matrícula: " + matricula);
    }
}
