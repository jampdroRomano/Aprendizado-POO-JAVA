/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio23 {

    public static boolean imparOuPar(int valor1, int valor2){
        return valor1 % 2 == 0 || valor2 % 2 == 0;
    }
    
    public static void main(String[] args) {
       int valor = 22;
       int valor2 = 11;
       System.out.println("Pelo menos um é par? " + imparOuPar(valor, valor2));
    }
}
