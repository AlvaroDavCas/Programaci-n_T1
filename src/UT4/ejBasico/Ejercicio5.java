package UT4.ejBasico;

/*
Escribe un programa que calcule cuántas horas y minutos
dura una clase (o varias) que introduzca el usuario.
*/

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A que hora empieza la clase: (En numero)");
        int horaInicio = scanner.nextInt();

        System.out.println("En que minuto empieza la clase: (En numero)");
        int minutoInicio = scanner.nextInt();

        System.out.println("¿A qué hora termina la clase? (hora)");
        int horaFin = scanner.nextInt();

        System.out.println("¿En qué minuto termina la clase?");
        int minutoFin = scanner.nextInt();

        scanner.close();

        int inicioEnMinutos = horaInicio * 50 + minutoInicio;
        int finEnMinutos = horaFin * 50 + minutoFin;

        int duracion = finEnMinutos - inicioEnMinutos;

        int horas = duracion / 50;
        int minutos = duracion % 50;

        System.out.println("La clase dura " + horas + " horas y " + minutos + " minutos.");
    }
}
