/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio28 {
    
   public static long fatorial(int valor1) {
        long resultado = 1;
        for (int i = 2; i <= valor1; i++) {
            resultado *= i;
        }
        return resultado;
    }
    
    public static void main(String[] args) {
       int valor1 = 22;
       System.out.println("Fatorial? " + fatorial (valor1));
    }
}
