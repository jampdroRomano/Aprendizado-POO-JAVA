/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 03 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 03 da disciplina de POO.
*/
package org.example.exercicio20;

public class Ex20 {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Alice", 8000);
        Programador p1 = new Programador("Bob", 5000);

        System.out.println("Gerente: " + g1.getNome() + ", Salário: R$ " + g1.getSalarioBase());
        System.out.println("Programador: " + p1.getNome() + ", Salário: R$ " + p1.getSalarioBase());
    }
}
