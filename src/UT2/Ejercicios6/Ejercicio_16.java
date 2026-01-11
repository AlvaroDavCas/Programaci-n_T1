package UT2.Ejercicios6;

/*
Realiza un programa que compruebe si en una palabra se repite alguna vocal más de 2 veces.
El programa pedirá que se teclee una palabra y comprobará las vocales que contiene,
cuando compruebe que una vocal aparece más de dos veces emitirá un mensaje en la pantalla y terminará.
El programa debe terminar en el mismo instante en que encuentre más de dos vocales iguales,
no esperará a comprobar toda la palabra (prohibido usar break).

Ejemplo: Escriba una palabra: “Instintivo”

Dará como resultado: “Tiene mas de dos vocales iguales”
*/

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba una palabra: ");
        String palabra = scanner.nextLine().toLowerCase();

        scanner.close();

        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        int j = 0;
        boolean repetida = false;
        while (j < palabra.length() && !repetida) {
            char letra = palabra.charAt(j);

            switch (letra) {
                case 'a' -> a++;
                case 'e' -> e++;
                case 'i' -> i++;
                case 'o' -> o++;
                case 'u' -> u++;
            }

            if (a > 2 || e > 2 || i > 2 || o > 2 || u > 2) {
                repetida = true;
            }

            j++;
        }

        if (repetida) {
            System.out.println("Tiene más de dos vocales iguales");
        } else {
            System.out.println("No tiene más de dos vocales iguales");
        }
    }
}
