package UT2.Ejercicios6;

/*
Implementa un programa que intercale las letras de dos palabras.
El programa debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las dos palabras intercaladas.

Introduciendo:   Primera palabra “INTERNET”    Segunda palabra “correo”

Da como salida: “IcNoTrErReNoET”
*/

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra: ");
        String frase = scanner.nextLine().toUpperCase();

        System.out.println("Introduce una segunda palabra: ");
        String fra = scanner.nextLine().toLowerCase();

        scanner.close();

        String fraseFinal = codificacion(frase, fra);
        System.out.println(fraseFinal);
    }

    static String codificacion(String frase, String fra) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < frase.length() || i < fra.length()) {
            if (i < frase.length()) {
                sb.append(frase.charAt(i));
            }
            if (i < fra.length()) {
                sb.append(fra.charAt(i));
            }
            i++;
        }

        return sb.toString();
    }
}
