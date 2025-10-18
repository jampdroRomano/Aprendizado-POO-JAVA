package org.example.exercicio8;

public enum Naipe {
    COPAS("♥"),
    ESPADAS("♠"),
    OUROS("♦"),
    PAUS("♣");

    private final String simbolo;

    Naipe(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
