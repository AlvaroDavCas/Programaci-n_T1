package UT1.ejercicios2;

/*
Escribe un programa que recoja por teclado tu nombre y luego lo muestre por pantalla.
 */

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cual es tu nombre?");

        String nombre = scanner.nextLine();

        System.out.println("Tu nombre es: " + nombre);
    }
}
