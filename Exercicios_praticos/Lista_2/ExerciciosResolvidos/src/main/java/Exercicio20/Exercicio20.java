/*
    Nome: João Pedro Vieira dos Santos Romano
    Data: 24/08/2025
    Lista: 02 - Programação Orientada a Objetos (POO)
    Descrição: Exercícios referentes à lista 02 da disciplina de POO.
*/
public class Exercicio20 {

    public static boolean terminaComZ(String texto) {
        return texto.endsWith("z");
    }

    public static void main(String[] args) {
        String palavra1 = "quiz";
        String palavra2 = "Java";

        System.out.println(palavra1 + " termina com 'z'? " + terminaComZ(palavra1));
        System.out.println(palavra2 + " termina com 'z'? " + terminaComZ(palavra2));
    }
}

