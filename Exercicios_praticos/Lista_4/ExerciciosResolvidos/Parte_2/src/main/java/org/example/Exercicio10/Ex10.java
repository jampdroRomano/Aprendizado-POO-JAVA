/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio10;

public class Ex10 {
    public static void main(String[] args) {
        Funcionario f1 = new FuncionarioHorista("João", 50, 160);
        Funcionario f2 = new FuncionarioAssalariado("Maria", 3000);
        Funcionario f3 = new FuncionarioComissionado("Pedro", 20000, 0.10);

        System.out.println(f1.nome + " - Pagamento: R$ " + f1.calcularPagamento());
        System.out.println(f2.nome + " - Pagamento: R$ " + f2.calcularPagamento());
        System.out.println(f3.nome + " - Pagamento: R$ " + f3.calcularPagamento());
    }
}