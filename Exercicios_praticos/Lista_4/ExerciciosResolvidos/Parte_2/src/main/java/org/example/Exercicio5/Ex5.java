/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio5;

public class Ex5 {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thor", 100);
        Mago m = new Mago("Merlin", 80);

        g.atacar(m);
        m.atacar(g);
        g.atacar(m);

        System.out.println(g.getNome() + " - Vida: " + g.getVida());
        System.out.println(m.getNome() + " - Vida: " + m.getVida());
    }
}
