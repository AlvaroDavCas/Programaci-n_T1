package UT2.Ejercicios6;

/*
Implementa un programa que sume todas las cifras de los números que aparecen en una cadena de caracteres.
Introduciendo: “15 de Noviembre de 2012”
Da como salida: 11
*/

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una oracion que contenga numeros: ");
        String frase = scanner.nextLine();

        scanner.close();
    }

    static String contar(String frase){

        StringBuilder texto = new StringBuilder();
        int numeros = 0;
        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            a += 1;
            texto.append(a);
        }

        return frase;
    }
}
