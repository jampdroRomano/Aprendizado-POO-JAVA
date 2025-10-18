package org.example.exercicio7;

public enum TipoDocumento {
    CPF,
    CNPJ;

    public boolean validar(String numero) {
        switch (this) {
            case CPF:
                return numero != null && numero.matches("\\d{11}");
            case CNPJ:
                return numero != null && numero.matches("\\d{14}");
            default:
                return false;
        }
    }
}
