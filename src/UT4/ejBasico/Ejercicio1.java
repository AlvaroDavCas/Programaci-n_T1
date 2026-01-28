package UT4.ejBasico;

/*
Escribe un programa que muestre la fecha actual en el formato
"Hoy es día, dd de mes de yyyy" (ejemplo: "Hoy es miércoles, 02 de abril de 2025").
*/

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Ejercicio1 {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now();
        System.out.println("Hoy es: " + DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(fecha));
    }
}
