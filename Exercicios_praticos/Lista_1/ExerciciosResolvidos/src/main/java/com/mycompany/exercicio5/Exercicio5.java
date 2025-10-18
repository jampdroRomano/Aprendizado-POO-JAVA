/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio5;

import java.util.Scanner;

/**
 *
 * @author jpvs0
 */
public class Exercicio5 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Digite um numero inteiro");
    int num = sc.nextInt();
    
    if(num % 2 == 0){
        System.out.println("O numero eh par");
    }else {
        System.out.println("O numero eh impar");
    }
    
    
    sc.close();
    
    }
}
