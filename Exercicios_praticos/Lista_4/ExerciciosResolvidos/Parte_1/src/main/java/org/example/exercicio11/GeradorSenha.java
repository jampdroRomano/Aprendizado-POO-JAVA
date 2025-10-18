package org.example.exercicio11;

import java.util.Random;

public class GeradorSenha {

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

    public static String gerar(int tamanho) {
        StringBuilder senha = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            int index = random.nextInt(CARACTERES.length());
            senha.append(CARACTERES.charAt(index));
        }
        return senha.toString();
    }
}
