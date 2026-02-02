package UT4.FechasViaje;

/*
Estás de merecidas vacaciones, y tienes que coger un vuelo para ir a Japón. Los tiempos son los siguientes.
Sales el día 12 de abril del 2025 a las 20:45 de Madrid, y tienes 6:45 de vuelo hasta Doha.
Tienes 1h de tránsito en el aeropuerto (no tienes que coger las maletas porque has reservado con la misma compañía el vuelo completo a Japón).
Despegas de Doha y tienes 10:25 hasta el aeropuerto de Haneda (Tokio).
Se pide:
Calcular las horas locales a las que despegas y aterrizas.
Como eres una persona responsable, quieres avisar a tu familia cuando aterrizas, pero no quieres despertarlos,
por eso si cuando aterrices es una hora respetable (9am a 22pm),
puedes llamar, sino mandas un whatsapp. Calcula en los dos aterrizajes qué debes hacer.
Calcula el tiempo total del viaje (incluida escala).
Si llegas un sábado o domingo, avisa a tus amigos con un whatsapp.
*/

import java.time.DayOfWeek;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Ejercicio1 {
    public static void main(String[] args) {

        ZoneId madrid = ZoneId.of("Europe/Madrid");
        ZoneId doha = ZoneId.of("Asia/Qatar");
        ZoneId tokio = ZoneId.of("Asia/Tokyo");

        ZonedDateTime salidaDeMadrid = ZonedDateTime.of(2025, 4, 12, 20, 45, 0, 0, madrid);
        ZonedDateTime llegarDoha = salidaDeMadrid.plusHours(6).plusMinutes(45).withZoneSameInstant(doha);
        ZonedDateTime salidaDeDoha = llegarDoha.plusHours(1);
        ZonedDateTime llegarTokio = salidaDeDoha.plusHours(10).plusMinutes(25).withZoneSameInstant(tokio);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        System.out.println("Salida de Madrid: " + formatter.format(salidaDeMadrid));
        System.out.println("Llegada a Doha: " + formatter.format(llegarDoha));
        System.out.println("Salida de Doha: " + formatter.format(salidaDeDoha));
        System.out.println("Llegada a Tokio: " + formatter.format(llegarTokio));

        avisarFamilia("Doha", llegarDoha);
        avisarFamilia("Tokio", llegarTokio);

        int horasTotales = (int) java.time.Duration.between(salidaDeMadrid, llegarTokio).toHours();
        int minutosTotales = java.time.Duration.between(salidaDeMadrid, llegarTokio).toMinutesPart();
        System.out.println("El tiempo que dura el viaje es: " + horasTotales + minutosTotales);

        if (llegarTokio.getDayOfWeek() == DayOfWeek.SATURDAY || llegarTokio.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Llegas en fin de semana, manda un Whatsapp a los amigos");
        }
    }

    private static void avisarFamilia(String ciudad, ZonedDateTime llegada) {
        int hora = llegada.getHour();

        if (hora >= 9 && hora < 22) {
            System.out.println("Al llegar a " + ciudad + " puedo llamar por telefono");
        } else {
            System.out.println("Al llegar a " + ciudad + " mando un WhatsApp");
        }
    }
}
