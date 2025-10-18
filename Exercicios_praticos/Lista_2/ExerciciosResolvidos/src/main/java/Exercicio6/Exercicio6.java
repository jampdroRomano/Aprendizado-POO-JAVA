/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/



import java.util.Scanner;

public class Exercicio6 {
    public static int menor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int a = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int b = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int c = sc.nextInt();

        int m = a;
        if (b < m) m = b;
        if (c < m) m = c;

        return m;
    }

    public static void main(String[] args) {
        System.out.println("O menor número é: " + menor());
    }
}
