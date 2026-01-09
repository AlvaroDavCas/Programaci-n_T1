package UT2.Ejercicios6;

/*
Escribe un programa que lea un número en coma flotante de doble precisión,
lo convierta a una cadena y le añada las comas separadoras de los miles.
Introduciendo: 2388432.34
Da como salida: 2,388,432.34
*/

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un numero con decimales: ");
        StringBuilder numero = new StringBuilder(scanner.nextLine());

        for (int i = 0; i <= numero.length(); i++) {
            numero.append(i);
            if (i < 3) numero.append(",");
        }
        System.out.println(numero.toString());

    }
}
