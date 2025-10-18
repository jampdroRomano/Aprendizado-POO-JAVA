package org.example.exercicio13;

public class ValidadorCPF {

    public static boolean validar(String cpf) {
        return cpf != null && cpf.matches("\\d{11}");
    }
}
