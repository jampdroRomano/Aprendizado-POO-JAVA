/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicio2;

import java.util.Scanner;

/**
 *
 * @author jpvs0
 */
public class Exercicio2 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int somaInt = 10, divisaoInt = 2, multiInt = 12;
    float somaFloat = 1.02f, divisaoFloat = 2.23f, multiFloat = 10.24f;
    double somaDouble = 12.21312, divisaoDouble = 32.12321, multiDouble = 45.24312;
    
    
    System.out.println("Soma de int " + somaInt + " + soma float " + somaFloat + "soma Double " + somaDouble + " = " + (somaInt + somaFloat + somaDouble) );
    System.out.println("Subtrcao de int " + somaInt + " + Subtrcao float " + somaFloat + "Subtrcao Double " + somaDouble + " = " + (somaInt - somaFloat - somaDouble) );
    System.out.println("Divisao de int " + divisaoInt + " + Divisao float " + divisaoFloat + "Divisao Double " + divisaoDouble + " = " + (somaInt / somaFloat / somaDouble) );
    System.out.println("Multiplicacao de int " + multiInt + " + Multiplicacao float " + multiFloat + " Double " + multiDouble + " = " + (somaInt * somaFloat * somaDouble) );
    
    
    
    
    
    
    
    sc.close();
    }
}
