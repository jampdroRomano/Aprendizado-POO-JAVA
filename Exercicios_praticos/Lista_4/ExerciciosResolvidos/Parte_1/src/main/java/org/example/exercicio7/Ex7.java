/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio7;

public class Ex7 {
    public static void main(String[] args) {
        String cpf = "12345678901";
        String cnpj = "12345678000199";

        System.out.println("CPF " + cpf + " válido? " + TipoDocumento.CPF.validar(cpf));
        System.out.println("CNPJ " + cnpj + " válido? " + TipoDocumento.CNPJ.validar(cnpj));
    }
}
