package Exercicio25;

/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/
public class Exercicio25 {
    
    public static boolean saoTodosDiferentes(int valor1, int valor2, int valor3){
        return valor1 != valor2 && valor1 != valor3 && valor2!= valor3 && valor3!= valor1;
    }
    
    public static void main(String[] args) {
       int valor1 = 22;
       int valor2 = 23;
       int valor3 = 24;
       System.out.println("São todos diferentes? " + saoTodosDiferentes (valor1, valor2, valor3));
    }
}
