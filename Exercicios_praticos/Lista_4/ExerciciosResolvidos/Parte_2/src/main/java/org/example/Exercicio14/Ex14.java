/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 07/09/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.Exercicio14;

import java.util.ArrayList;
import java.util.List;

public class Ex14 {
    public static void main(String[] args) {
        List<Notificacao> notificacoes = new ArrayList<>();
        notificacoes.add(new Email());
        notificacoes.add(new SMS());

        for (Notificacao n : notificacoes) {
            n.enviar();
        }
    }
}