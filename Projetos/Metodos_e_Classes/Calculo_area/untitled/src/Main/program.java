package Main;

import Entities.calculo;

import java.util.Scanner;

public class program {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            calculo calculoRetangulo = new calculo();

            System.out.print("Digite a altura e depois a largura do retangulo:\n");
            calculoRetangulo.height = sc.nextDouble();
            calculoRetangulo.width = sc.nextDouble();

            System.out.printf("AREA - %.2f\n", calculoRetangulo.area());
            System.out.printf("PERIMETRO - %.2f\n", calculoRetangulo.perimetro());
            System.out.printf("DIAGONAL - %.2f\n", calculoRetangulo.diagonal());

            sc.close();
        }


}
