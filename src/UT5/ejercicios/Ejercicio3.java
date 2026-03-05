package UT5.ejercicios;

/*
Crea una lista de números enteros (Integer).
Rellena la lista con 10 números aleatorios entre 1 y 50.
Calcula la suma de todos los números de la lista recorriéndola con un bucle for clásico.
Muestra el número mayor encontrado en la lista.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int numero = r.nextInt(50) + 1;
            numeros.add(numero);
        }

        System.out.println("Lista de números: " + numeros);

        int suma = 0;
        int mayor = numeros.get(0);

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);

            if (numeros.get(i) > mayor) {
                mayor = numeros.get(i);
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Número mayor: " + mayor);
    }

}
