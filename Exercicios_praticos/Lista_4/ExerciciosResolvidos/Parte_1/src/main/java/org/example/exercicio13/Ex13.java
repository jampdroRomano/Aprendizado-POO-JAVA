/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio13;

public class Ex13 {
    public static void main(String[] args) {
        String cpfValido = "12345678901";
        String cpfInvalido = "12345678";

        System.out.println(cpfValido + " válido? " + ValidadorCPF.validar(cpfValido));
        System.out.println(cpfInvalido + " válido? " + ValidadorCPF.validar(cpfInvalido));
    }
}
