package UT2.Ejercicios6;

/*
Desarrolla un programa que rote una cadena tantas veces como se le indique.
Introduciendo: “Lunes”
Rotaciones: 2
Da como salida: “nesLu”
*/

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce una frase: ");
        String frase = scanner.nextLine();

        System.out.println("Introduce el número de rotaciones: ");
        int rotaciones = scanner.nextInt();

        String resultado = rotar(frase, rotaciones);
        System.out.println(resultado);

        scanner.close();

    }

    static String rotar(String frase, int rotaciones) {

        String inicio = frase.substring(0, rotaciones);
        String resto = frase.substring(rotaciones);

        return resto + inicio;

    }
}
