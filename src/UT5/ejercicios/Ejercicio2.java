package UT5.ejercicios;

/*
Utilizando la lista del ejercicio anterior:
Pide un nombre por teclado y comprueba si el alumno existe en la lista.
Si existe, modifica su nombre para que aparezca todo en mayúsculas.
Muestra la lista completa utilizando un bucle for-each.
*/

import java.util.List;
import java.util.ArrayList;

public class Ejercicio2 {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Rafa");
        nombres.add("Pablo");
        nombres.add("Jose Pablo");
        nombres.add("Angel");
        nombres.add(2, "Omar");

        for (int i = 0; i < nombres.size(); i++) {
            if (nombres.get(i).equals("Pablo")){
                System.out.println(nombres.get(i).toUpperCase());
            } else {
                System.out.println(nombres.get(i));
            }
        }

        for (String nombre : nombres){
            System.out.println(nombre);
        }
    }
}
