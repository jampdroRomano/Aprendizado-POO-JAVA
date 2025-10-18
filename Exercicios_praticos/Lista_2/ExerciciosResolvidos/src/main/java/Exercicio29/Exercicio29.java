/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio29 {
    
   public static boolean isNumeroPerfeito(int numero) {
        int somaDivisores = 0;

        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }

        return somaDivisores == numero;
    }
    
    public static void main(String[] args) {
       int valor1 = 22;
       System.out.println("Perfeito? " + isNumeroPerfeito (valor1));
    }
}
