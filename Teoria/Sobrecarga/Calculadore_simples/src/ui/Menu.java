package ui;

import java.util.Scanner;
import Calculo.Calculadora;

public class Menu {

    private Scanner entrada = new Scanner(System.in);
    private Calculadora calc = new Calculadora();

    public void mostrarMenu() {
        System.out.println("==== CALCULADORA COM SOBRECARGA ====");
        System.out.println("Escolha a operação:");
        System.out.println("1 - Somar dois inteiros");
        System.out.println("2 - Somar três inteiros");
        System.out.println("3 - Somar dois números com casas decimais");
        System.out.print("Opção: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                somarDoisInt();
                break;
            case 2:
                somarTresInt();
                break;
            case 3:
                somarDoisDouble();
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    private void somarDoisInt() {
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = entrada.nextInt();
        int resultado = calc.somar(n1, n2);
        System.out.println("Resultado da soma: " + resultado);
    }

    private void somarTresInt() {
        System.out.print("Digite o primeiro número inteiro: ");
        int a = entrada.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int b = entrada.nextInt();
        System.out.print("Digite o terceiro número inteiro: ");
        int c = entrada.nextInt();
        int resultado = calc.somar(a, b, c);
        System.out.println("Resultado da soma: " + resultado);
    }

    private void somarDoisDouble() {
        System.out.print("Digite o primeiro número (com casas decimais): ");
        double x = entrada.nextDouble();
        System.out.print("Digite o segundo número (com casas decimais): ");
        double y = entrada.nextDouble();
        double resultado = calc.somar(x, y);
        System.out.println("Resultado da soma: " + resultado);
    }
}
