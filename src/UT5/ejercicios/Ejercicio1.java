package UT5.ejercicios;

/*
Crea un programa que gestione una lista de nombres de alumnos (String) utilizando un ArrayList.
Añade cinco nombres a la lista.
Inserta un nombre nuevo en la tercera posición (índice 2).
Muestra el tamaño actual de la lista utilizando el atributo o metodo correspondiente.
Elimina al alumno que esté en la última posición.
*/

import java.util.List;
import java.util.ArrayList;

public class Ejercicio1 {

    public static void main(String[] args) {

        List<String> nombresAlumnos = new ArrayList<>();

        nombresAlumnos.add("Hugo");
        nombresAlumnos.add("Ruben");
        nombresAlumnos.add("Rafa");
        nombresAlumnos.add("Alberto");
        nombresAlumnos.add("Omar");

        nombresAlumnos.add(2, "Angel");
        System.out.println(nombresAlumnos);

        int total = nombresAlumnos.size();
        System.out.println(total);


        nombresAlumnos.removeLast();
        System.out.println(nombresAlumnos);
    }
}
