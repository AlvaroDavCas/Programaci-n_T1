package UT2.Ejercicios6;

/*
Crea un programa que descubra si una palabra es o no palíndroma,
es decir se lee igual del derecho que del revés.
Introduciendo: “oso”
Da como salida: true
*/

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("introduce una palabara: ");
        String palabra = scanner.nextLine();

        scanner.close();

        boolean palindromo = palindromo(palabra);
        System.out.println(palindromo);

    }

    static boolean palindromo(String palabra) {

        StringBuilder inver = new StringBuilder(palabra).reverse();

        return palabra.equals(inver.toString());

    }
}
