/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio6;

import java.util.Scanner;

/**
 *
 * @author jpvs0
 */
public class Exercicio6 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
            
        int totalSoma, i, menu;
        int totalSubtracao, totalMultiplicacao;
        
    
        do {
            System.out.println("*--------------------------------*");
            System.out.println("|          Calculadora           |");
            System.out.println("*--------------------------------*");
            System.out.println("| 1-          Somar              |");
            System.out.println("| 2-        Subtrair             |");
            System.out.println("| 3-        Multiplicacao        |");
            System.out.println("| 4-        Divisao              |");
            System.out.println("| 0-    Encerrar o programa      |");
            System.out.println("*--------------------------------*");
            menu = sc.nextInt();
        
            switch (menu){
                case 1:
                    System.out.println("Digite quantos numeros deseja somar");
                    totalSoma = sc.nextInt();
                    
                    double[] numSoma = new double[totalSoma];
                    
                    for(i = 0; i < totalSoma; i++){
                        System.out.println("Digite o numero " + (i + 1) + ":");
                        numSoma[i] = sc.nextDouble();
                    
                    }
                    
                    double soma = 0;
                    
                    for (int j = 0; j < totalSoma; j++){
                        soma += numSoma[j];
                    }
                    
                    System.out.println("Soma total: " + soma);
                    
                    break;
                    
                case  2: 
                    System.out.println("Digite quantos numeros deseja subtrair");
                    totalSubtracao = sc.nextInt();
                    
                    double[] numSubtracao = new double[totalSubtracao];
                    
                     for(i = 0; i < totalSubtracao; i++){
                        System.out.println("Digite o numero " + (i + 1) + ":");
                        numSubtracao[i] = sc.nextDouble();
                    }
                     
                     
                     if(totalSubtracao > 0){
                        double resultado = numSubtracao[0];
                        
                        for (int j = 1; j < totalSubtracao; j++){
                            resultado -= numSubtracao[j];
                       
                        }
                        
                         System.out.println("Resultado da subtracao: " + resultado);
                     
                     }
                    
                    
                    break;
                    
                case 3:
                     System.out.println("Digite quantos numeros deseja multiplicar");
                     totalMultiplicacao = sc.nextInt();
                     
                     double[] numMultiplicacao = new double[totalMultiplicacao];
                     
                     for(i = 0; i < totalMultiplicacao; i++){
                        System.out.println("Digite o numero " + (i + 1) + ":");
                        numMultiplicacao[i] = sc.nextDouble();
                    }
                     
                     double resultado = 1;
                     
                     for (int j = 0; j < totalMultiplicacao; j++) {
                        resultado *= numMultiplicacao[j];
                    }
                     
                     System.out.println("Resultado da multiplicacao: " + resultado);
                     break;
               
                     
                     
                     
                case 4:
                    double[] numDivisao = new double[2];
                    
                     for( i = 0; i < 2; i++){
                        System.out.println("Digite o numero " + (i + 1) + ":");
                        numDivisao[i] = sc.nextDouble();
                    }
                    
                    if(numDivisao[1] == 0) {
                         System.out.println("Erro: divisão por zero não é permitida.");
                    } else {
                         resultado = numDivisao[0] / numDivisao[1];
                         System.out.println("Resultado da divisão: " + resultado);
                    }
                    
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
