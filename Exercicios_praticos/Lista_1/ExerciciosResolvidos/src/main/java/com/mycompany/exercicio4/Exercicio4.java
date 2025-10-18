/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio4;

import java.util.Scanner;
/**
 *
 * @author jpvs0
 */
public class Exercicio4 {
     public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite um numero inteiro para comparar:");
     int num1 = sc.nextInt();
     System.out.println("Digite um segundo numero inteiro para comparar:");
     int num2 = sc.nextInt();
     
        if(num1 != num2){
             System.out.println("Numeros diferentes");
        } else if (num1 == num2){
            System.out.println("Numeros iguais");
        }
     
     
        if(num1 > num2){
            System.out.println("Numero: " + num1 + " eh maior que o numero: " + num2);
        } else if (num1 < num2) {
            System.out.println("Numero: " + num1 + " eh menor que o numero: " + num2);
        } 
     
     System.out.print("Tem dinheiro? (true/false): ");
     boolean temDinheiro = sc.nextBoolean();
     
     System.out.print("Mercado aberto? (true/false): ");
     boolean mercadoAberto = sc.nextBoolean();
     
        if (temDinheiro && mercadoAberto) {
            System.out.println("Pode comprar.");
        } else {
            System.out.println("Nao pode comprar.");
        }

   

     System.out.print("Esta sol? (true/false): ");
     boolean sol = sc.nextBoolean();
     
     System.out.print("Feriado? (true/false): ");
     boolean feriado = sc.nextBoolean();
     
        if (sol || feriado) {
            System.out.println("Pode passear.");
        } else {
            System.out.println("Fique em casa.");
        }

        

     System.out.print("Porta aberta? (true/false): ");
     boolean portaAberta = sc.nextBoolean();
     
        if (!portaAberta) {
            System.out.println("Porta fechada.");
        } else {
            System.out.println("Porta aberta.");
        }
     
     
     
     

     
     sc.close();
     }
}
