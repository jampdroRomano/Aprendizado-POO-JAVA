/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 31/08/2025
    Lista: 04 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 04 da disciplina de POO.
*/
package org.example.exercicio9;

public class Ex9 {
    public static void main(String[] args) {
        double celsius = 25;
        double fahrenheit = 77;

        System.out.println(celsius + "°C = " + ConversorTemperatura.celsiusParaFahrenheit(celsius) + "°F");
        System.out.println(fahrenheit + "°F = " + ConversorTemperatura.fahrenheitParaCelsius(fahrenheit) + "°C");
    }
}
