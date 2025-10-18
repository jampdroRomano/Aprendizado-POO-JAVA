/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio26 {
    
    public static double raizQuadrada(int valor1){
        double aproximacao = valor1 / 2.0;
        double tolerancia = 0.000001;

        while (Math.abs(aproximacao * aproximacao - valor1) > tolerancia) {
            aproximacao = (aproximacao + valor1 / aproximacao) / 2.0;
        }

        return aproximacao;
    }
    
    public static void main(String[] args) {
       int valor1 = 22;
       System.out.println("Raiz quadrada sem Math.sqrt? " + raizQuadrada (valor1));
    }
}
