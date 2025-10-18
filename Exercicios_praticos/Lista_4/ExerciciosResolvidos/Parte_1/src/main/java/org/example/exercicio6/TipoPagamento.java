package org.example.exercicio6;

public enum TipoPagamento {
    CREDITO,
    DEBITO,
    PIX,
    BOLETO;

    public double calcularDesconto(double valor) {
        switch (this) {
            case CREDITO:
                return valor * 0.95;
            case DEBITO:
                return valor * 0.97;
            case PIX:
                return valor * 0.90;
            case BOLETO:
                return valor * 0.92;
            default:
                return valor;
        }
    }
}
