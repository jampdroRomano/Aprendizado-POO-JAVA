/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio13;

public class Ex13 {
    public static void main(String[] args) {
        Tarefa t1 = new TarefaEmail();
        Tarefa t2 = new TarefaBackup();

        t1.executar();
        t2.executar();
    }
}
