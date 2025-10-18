/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/



import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n >= 1 && n <= 100) {
            System.out.println("O número está dentro do intervalo de 1 a 100.");
        } else {
            System.out.println("O número está fora do intervalo de 1 a 100.");
        }

        sc.close();
    }
}
