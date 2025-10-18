/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio4;

public class Ex4 {
    public static void main(String[] args) {
        for (StatusPedido status : StatusPedido.values()) {
            System.out.println(status + " - Pode cancelar? " + status.podeCancelar());
        }
    }
}
