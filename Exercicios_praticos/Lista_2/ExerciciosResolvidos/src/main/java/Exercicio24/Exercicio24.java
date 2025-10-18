/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio24 {
    
    public static boolean multiploDe3E5(int valor){
        return valor % 3 == 0 && valor % 5 == 0;
    }
    
    public static void main(String[] args) {
       int valor = 22;
       System.out.println("É multiplo de 3 e %? " + multiploDe3E5(valor));
    }
}
