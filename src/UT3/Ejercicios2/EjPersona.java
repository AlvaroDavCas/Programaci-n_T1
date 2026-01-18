package UT3.Ejercicios2;

import java.util.Scanner;

public class EjPersona {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Introduce la edad: ");
        int edad = scanner.nextInt();

        System.out.print("Introduce el sexo (H/M): ");
        char sexo = scanner.next().charAt(0);

        System.out.print("Introduce el peso (kg): ");
        int peso = scanner.nextInt();

        System.out.print("Introduce la altura (m): ");
        int altura = scanner.nextInt();

        Persona persona = new Persona(nombre, edad, sexo, peso, altura);

        System.out.print("Introduce el nombre: ");
        String nombre1 = scanner.nextLine();

        System.out.print("Introduce la edad: ");
        int edad1 = scanner.nextInt();

        System.out.print("Introduce el sexo (H/M): ");
        char sexo1 = scanner.next().charAt(0);

        Persona persona1 = new Persona(nombre1, edad1, sexo1);

        System.out.print("Introduce el nombre: ");
        String nombre2 = scanner.nextLine();

        Persona persona2 = new Persona(nombre2);

        mostrarP(persona);
        mostrarP(persona1);
        mostrarP(persona2);

        scanner.close();
    }

    private static void mostrarP(Persona pers) {

        int imc = (int) pers.calcularIMC();

        if (imc == -1) {
            System.out.println("Está por debajo de su peso ideal");
        }
        if (imc == 0) {
            System.out.println("Está en su peso ideal");
        }
        if (imc == 1) {
            System.out.println("Tiene sobrepeso");
        }

        if (pers.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

        System.out.println(pers.toString());
    }
}
