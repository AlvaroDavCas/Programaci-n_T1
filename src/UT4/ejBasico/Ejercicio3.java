package UT4.ejBasico;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/*
Escribe un programa que muestre la hora actual en España ("Europe/Madrid"),
Japón ("Asia/Tokyo") y México ("America/Mexico_City") en el formato "dd/MM/yyyy HH:mm z"
*/

public class Ejercicio3 {
    public static void main(String[] args) {

        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm z");

        ZonedDateTime espana = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime japon = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime mexico = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));

        System.out.println("España: " + espana.format(fecha));
        System.out.println("Japón: " + japon.format(fecha));
        System.out.println("México: " + mexico.format(fecha));
    }
}

