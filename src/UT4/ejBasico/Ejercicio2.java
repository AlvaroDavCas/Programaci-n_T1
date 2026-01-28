package UT4.ejBasico;

/*
Crea un programa que pida al usuario su fecha de nacimiento (día y mes)
y calcule cuántos días faltan para su próximo cumpleaños desde hoy (02/04/2025).
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento (En numero)");
        int dia = scanner.nextInt();
        System.out.println("Introduce tu mes de nacimiento (En numero)");
        int mes = scanner.nextInt();
        scanner.close();

        LocalDate cumple = LocalDate.of(LocalDate.now().getYear(), mes, dia);
        LocalDate hoy = LocalDate.now();

        Period p = Period.between(hoy, cumple);

        System.out.println(p.getMonths() + " meses y " + p.getDays() + " días");
    }
}
