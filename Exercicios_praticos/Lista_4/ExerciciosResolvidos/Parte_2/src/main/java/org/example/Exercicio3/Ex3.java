/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio3;
import java.util.ArrayList;
import java.util.List;


public class Ex3 {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        animais.add(new Passaro());

        for (Animal a : animais) {
            a.fazerSom();
        }
    }
}
