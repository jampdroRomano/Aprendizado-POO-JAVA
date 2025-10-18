package org.example.exercicio3;

public enum NivelAcesso {
    ADMIN,
    USUARIO,
    CONVIDADO;

    public String getPermissoes() {
        switch (this) {
            case ADMIN:
                return "Acesso total ao sistema";
            case USUARIO:
                return "Acesso limitado a funcionalidades comuns";
            case CONVIDADO:
                return "Acesso apenas para visualização";
            default:
                return "Sem permissões";
        }
    }
}
