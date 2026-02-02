package UT4.ejBasico;

/*
Crea un programa que cuente cuántos días laborables
(lunes a viernes) hay entre el 01/04/2025 y el 15/04/2025.
*/

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Ejercicio6 {
    public static void main(String[] args) {

        LocalDate fechaInicio = LocalDate.of(2025, 4, 1);
        LocalDate fechaFin = LocalDate.of(2025, 4, 15);

        int diasLaborables = 0;

        while (!fechaInicio.isAfter(fechaFin)) {

            DayOfWeek diaSemana = fechaInicio.getDayOfWeek();

            if (diaSemana != DayOfWeek.SATURDAY &&
                    diaSemana != DayOfWeek.SUNDAY) {
                diasLaborables++;
            }

            fechaInicio = fechaInicio.plusDays(1);
        }

        System.out.println("Días laborables: " + diasLaborables);
    }
}
