package UT3.repasoPOO;

import java.util.Arrays;
import java.util.Scanner;

public class ejalumno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        alumno[] clase = new alumno[3];
        for (int i = 0; i < clase.length; i++) {
            System.out.println("Introduce un nombre: ");
            String n = scanner.nextLine();
            System.out.println("Introduce nota: ");
            double nota = scanner.nextDouble();
            clase[i] = new alumno(n, nota);

            if (nota < 5) {
                System.out.println("¿Le quieres aprobar? s/n");
                String s1 = scanner.next();
                if ("s".equals(s1)) {
                    clase[i].aprobar();
                } else {
                    System.out.println("Pues se queda suspenso");
                }
            }
        }
        System.out.println("Imprimimos todo el array :::::::");
        System.out.println(Arrays.toString(clase));

        scanner.close();
    }
}
