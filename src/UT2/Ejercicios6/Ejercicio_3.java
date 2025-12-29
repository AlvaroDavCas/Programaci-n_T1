package UT2.Ejercicios6;

/*
Implementa un programa que codifique una cadena cambiando cada letra por la siguiente en el código ASCII.
Introduciendo: “Lunes”
Da como salida: “Mvoft”
*/

import java.util.Scanner;

public class Ejercicio_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        String resultado = codificacion(frase);
        System.out.println(resultado);

        scanner.close();

    }

    static String codificacion(String frase) {

        StringBuilder texto = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            a += 1;
            texto.append(a);
        }

        return texto.toString();

    }
}
