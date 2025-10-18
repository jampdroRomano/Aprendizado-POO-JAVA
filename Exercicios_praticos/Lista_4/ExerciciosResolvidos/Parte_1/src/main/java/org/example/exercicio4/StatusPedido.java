package org.example.exercicio4;

public enum StatusPedido {
    PENDENTE,
    PROCESSANDO,
    ENVIADO,
    ENTREGUE;

    public boolean podeCancelar() {
        return this == PENDENTE || this == PROCESSANDO;
    }
}
