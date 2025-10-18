package application;

import util.calculator;

import java.util.Scanner;


public class program {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio");
        double radius = sc.nextDouble();

        double c = calculator.circurferencia(radius);

        double v = calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("Valor de PI: %.5f%n", calculator.PI);

        sc.close();
    }


}
