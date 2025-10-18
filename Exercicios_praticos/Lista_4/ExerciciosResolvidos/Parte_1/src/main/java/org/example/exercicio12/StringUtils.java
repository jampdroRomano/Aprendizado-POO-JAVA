package org.example.exercicio12;

public class StringUtils {

    public static String paraMaiusculas(String str) {
        return str.toUpperCase();
    }

    public static int contarVogais(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) >= 0) {
                count++;
            }
        }
        return count;
    }

    public static String inverter(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
