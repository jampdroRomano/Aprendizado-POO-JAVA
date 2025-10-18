package org.example.Exercicio10;

class FuncionarioComissionado extends Funcionario {
    private double vendas;
    private double taxaComissao;

    public FuncionarioComissionado(String nome, double vendas, double taxaComissao) {
        super(nome);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularPagamento() {
        return vendas * taxaComissao;
    }
}
