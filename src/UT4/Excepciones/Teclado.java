package UT4.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Introduce un numero");
            int numero = scanner.nextInt();
            System.out.println("El numero es: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("No has introducido un numero");
        } finally {
            scanner.close();
        }

    }
}
