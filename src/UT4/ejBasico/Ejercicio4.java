package UT4.ejBasico;

/*
Crea un metodo que reciba una fecha (LocalDate) y devuelva si es sábado o domingo.
*/

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce un día (en número)");
        int dia = scanner.nextInt();

        System.out.println("Introduce un mes (en número)");
        int mes = scanner.nextInt();

        System.out.println("Introduce un año");
        int anio = scanner.nextInt();

        scanner.close();

        if (esFindeSemana(dia, mes, anio)) {
            System.out.println("Es fin de semana ");
        } else {
            System.out.println("No es fin de semana ");
        }
    }

    public static boolean esFindeSemana(int dia, int mes, int anio) {
        LocalDate fecha = LocalDate.of(anio, mes, dia);
        DayOfWeek diaSemana = fecha.getDayOfWeek();

        return diaSemana == DayOfWeek.SATURDAY || diaSemana == DayOfWeek.SUNDAY;
    }
}
