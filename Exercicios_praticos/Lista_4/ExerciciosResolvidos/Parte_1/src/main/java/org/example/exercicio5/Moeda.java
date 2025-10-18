package org.example.exercicio5;

public enum Moeda {
    REAL(1.0),
    DOLAR(5.0),
    EURO(5.5);

    private final double cotacaoParaReal;

    Moeda(double cotacaoParaReal) {
        this.cotacaoParaReal = cotacaoParaReal;
    }

    public double getCotacaoParaReal() {
        return cotacaoParaReal;
    }

    public double converterParaReal(double valor) {
        return valor * cotacaoParaReal;
    }
}
