package UT5.ejercicios4;

/*
El metodo add() devuelve un valor booleano que indica si el elemento se añadió con éxito o no.
Tarea: Crea un Set<String> para matrículas de coches.
Acción: Intenta añadir dos veces la misma matrícula.
Lógica: Si el metodo add() devuelve false,
muestra un mensaje por pantalla: "ERROR: La matrícula ya existe en el sistema
*/

import java.util.HashSet;
import java.util.Set;

public class Ejercicio5 {

    public static void main(String[] args) {

        Set<String> matricula = new HashSet<>();
        matricula.add("12345");
        boolean repetido = matricula.add("12345");

        System.out.println(matricula);

        if (!repetido) {
            System.out.println("Critical error");
        } else {
            System.out.println(matricula);
        }

    }
}
