package UT2.Ejercicios6;

/*
 Desarrolla un programa que simule el juego del ahorcado.
 Elegimos una palabra y vamos pidiendo letras al usuario.
 Cada vez mostramos la palabra solo con las letras acertadas.
 Si no acierta todas las letras en 8 intentos, se da el juego por perdido.
*/

import java.util.Scanner;

public class Ejercico_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una palabra para iniciar el juego: ");
        String palabra = scanner.nextLine().toUpperCase();

        StringBuilder letra = new StringBuilder();
        for (int i = 0; i < palabra.length(); i++) {
            letra.append("-");
        }

        int i = 8;
        boolean ganar = false;
        while (i >= 0 && !ganar) {

            System.out.println("Palabra: " + letra);
            System.out.println("Introduce la siguinte letra: ");
            char let = scanner.nextLine().toUpperCase().charAt(0);

            boolean acertar = false;

            for (int j = 0; j < palabra.length(); j++) {
                if (palabra.charAt(j) == let) {
                    letra.setCharAt(j, let);
                    acertar = true;
                }
            }
            if (!acertar) {
                i--;
                System.out.println("Incorrecto");
            }
            if (letra.toString().equals(palabra)) {
                ganar = true;
            }
        }

        if (ganar) {
            System.out.println("ganaste");
        } else {
            System.out.println("perdiste. intentalo de nuevo");
        }

        scanner.close();
    }
}
