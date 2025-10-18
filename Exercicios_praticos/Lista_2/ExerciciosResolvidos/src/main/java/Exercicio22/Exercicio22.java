/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio22 {

    public static boolean imparOuMaiorQue50(int valor){
        return valor % 2 != 0 || valor > 50;
    }
    
    public static void main(String[] args) {
       int valor = 22;
       System.out.println("Impar ou maior que 50? " + imparOuMaiorQue50(valor));
    }
}
