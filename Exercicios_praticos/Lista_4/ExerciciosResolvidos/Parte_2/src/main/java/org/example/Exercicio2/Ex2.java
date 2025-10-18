/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio2;

public class Ex2 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario dev = new Desenvolvedor("Mariana", 4000);

        System.out.println("Gerente " + gerente.getNome() + " - Salário: R$" + gerente.calcularSalario());
        System.out.println("Desenvolvedor " + dev.getNome() + " - Salário: R$" + dev.calcularSalario());
    }
}