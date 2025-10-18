/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio15;

import java.util.ArrayList;
import java.util.List;

public class Ex15 {
    public static void main(String[] args) {
        List<Carta> baralho = new ArrayList<>();
        baralho.add(new CartaAtaque());
        baralho.add(new CartaDefesa());
        baralho.add(new CartaAtaque());

        for (Carta c : baralho) {
            c.jogar();
        }
    }
}
