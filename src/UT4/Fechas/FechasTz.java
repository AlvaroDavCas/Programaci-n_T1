package UT4.Fechas;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FechasTz {
    public static void main(String[] args) {

        ZonedDateTime españa = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
        ZonedDateTime usa = españa.withZoneSameInstant(ZoneId.of("America/New_York"));

        System.out.println(españa);
        System.out.println(usa);
    }

}
