/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/
public class Exercicio30 {
    
   public static boolean verificaIntervaloOuNegativo(int numero) {
        return (numero >= 10 && numero <= 30) || (numero < 0);
    }
    
    public static void main(String[] args) {
       int valor1 = 22;
       System.out.println("Intervalo ou negativo? " + verificaIntervaloOuNegativo (valor1));
    }
}
