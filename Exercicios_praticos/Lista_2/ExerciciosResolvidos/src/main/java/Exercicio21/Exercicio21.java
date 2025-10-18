/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio21 {

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 10;

        System.out.println(n1 + " e primo? " + ehPrimo(n1));
        System.out.println(n2 + " e primo? " + ehPrimo(n2));
    }
}

