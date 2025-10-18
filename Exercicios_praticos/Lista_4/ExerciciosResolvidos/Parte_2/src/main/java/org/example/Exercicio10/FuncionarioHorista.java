package org.example.Exercicio10;

class FuncionarioHorista extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncionarioHorista(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
