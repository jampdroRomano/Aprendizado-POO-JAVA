/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio3;

public class Ex3 {
    public static void main(String[] args) {
        for (NivelAcesso nivel : NivelAcesso.values()) {
            System.out.println(nivel + ": " + nivel.getPermissoes());
        }
    }
}
