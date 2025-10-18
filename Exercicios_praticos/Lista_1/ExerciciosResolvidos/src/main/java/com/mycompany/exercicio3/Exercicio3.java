package com.mycompany.exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        int valorInt;
        double valorDouble;
        byte valorByte;
        float valorFloat;
        long valorLong;
        short valorShort;
        int menu;
    
        do {
            System.out.println("*--------------------------------*");
            System.out.println("|        MENU DE CONVERSAO       |");
            System.out.println("*--------------------------------*");
            System.out.println("| 1-    Um int para byte         |");
            System.out.println("| 2-    Um double para float     |");
            System.out.println("| 3-    Um float para int        |");
            System.out.println("| 4-    Um long para short       |");
            System.out.println("| 0-    Encerrar o programa      |");
            System.out.println("*--------------------------------*");
            menu = sc.nextInt();
        
            switch (menu){
                case 1:
                    System.out.println("Digite um valor int");
                    valorInt = sc.nextInt();
                    valorByte = (byte) valorInt;
                    System.out.println(valorByte);
                    break;

                case 2:
                    System.out.println("Digite um valor double");
                    valorDouble = sc.nextDouble();
                    valorFloat = (float) valorDouble;
                    System.out.println(valorFloat);
                    break;

                case 3:
                    System.out.println("Digite um valor float");
                    valorFloat = sc.nextFloat();
                    valorInt = (int) valorFloat;
                    System.out.println(valorInt);
                    break;

                case 4:
                    System.out.println("Digite um valor long");
                    valorLong = sc.nextLong();
                    valorShort = (short) valorLong;
                    System.out.println(valorShort);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida");
                    break;
            }

        } while(menu != 0);

        sc.close();
    }
}
