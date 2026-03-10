package UT5.ejercicios4;

/*
Entender la diferencia entre un saco desordenado (HashSet) y uno que ordena automáticamente (TreeSet).
Tarea: Crea un TreeSet<Integer> para guardar los números premiados de una rifa.
Acción: Añade los números: 45, 12, 89, 3, 22.
Salida: Recorre el conjunto con un bucle for-each y observa cómo Java los muestra ordenados de menor a mayor sin haber hecho nada extra.
*/

import java.util.TreeSet;

public class Ejercicio3 {

    public static void main(String[] args) {

        TreeSet<Integer> rifa = new TreeSet<>();

        rifa.add(45);
        rifa.add(12);
        rifa.add(89);
        rifa.add(3);
        rifa.add(22);

        for (int numerosrifa : rifa) {
            System.out.println(numerosrifa);
        }

    }
}
