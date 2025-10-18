/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio7;

import java.util.Scanner;

/**
 *
 * @author jpvs0
 */
public class Exercicio7 {
    
     public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Digite um numero inteiro");
     int num = sc.nextInt();
     
     System.out.println("Tabuda do " + num);
     for(int i = 1; i < 11; i ++){
        System.out.println(num + " x " + i + " = " + (num * i));
     }
     
     sc.close();
     
     }
}
