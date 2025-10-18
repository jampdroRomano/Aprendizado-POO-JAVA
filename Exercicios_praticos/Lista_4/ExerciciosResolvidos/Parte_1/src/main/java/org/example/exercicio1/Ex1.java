
/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/


package org.example.exercicio1;

enum DiaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;

    public boolean ehUtil() {
        return this != SABADO && this != DOMINGO;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            if (dia.ehUtil()) {
                System.out.println(dia + " é dia útil.");
            } else {
                System.out.println(dia + " é fim de semana.");
            }
        }
    }
}
