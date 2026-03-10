package UT5.ejercicios4;

/*
Practicar la búsqueda rápida de elementos, una de las mayores ventajas de los conjuntos.
Tarea: Crea un HashSet<Integer> con una lista de 5 números de identificación (IDs) fijos.
Acción: Pide al usuario por teclado un número usando Scanner.
Salida: Indica mediante un boolean si ese ID tiene acceso (si está contenido en el Set) o no.
*/

import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        HashSet<Integer> codigos = new HashSet<>();
        codigos.add(12123);
        codigos.add(15422);
        codigos.add(62361);
        codigos.add(87233);
        codigos.add(97272);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un código de 5 dígitos");
        int nuevoCodigo = scanner.nextInt();
        scanner.close();

        boolean acceso = codigos.contains(nuevoCodigo);
        System.out.println(acceso);
    }
}
