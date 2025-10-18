/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/

public class Exercicio18 {

    /**
     * @param args the command line arguments
     */
    public static boolean contemJava(String texto) {
        return texto.contains("Java");
    }

    public static void main(String[] args) {
        String frase1 = "Eu estou aprendendo Java!";
        String frase2 = "Gosto de programar em Python.";

        System.out.println("Frase 1 contem 'Java'? " + contemJava(frase1));
        System.out.println("Frase 2 contem 'Java'? " + contemJava(frase2));
    }
}
