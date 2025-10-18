/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio12;

public class Ex12 {
    public static void main(String[] args) {
        String texto = "Olá Mundo";

        System.out.println("Maiúsculas: " + StringUtils.paraMaiusculas(texto));
        System.out.println("Número de vogais: " + StringUtils.contarVogais(texto));
        System.out.println("Invertida: " + StringUtils.inverter(texto));
    }
}
