package EjerciciosDeFunciones;

import java.util.Scanner;

public class Ejemplo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce la base");
        int base = scanner.nextInt();
        System.out.println("Introduce la altura");
        int altura = scanner.nextInt();

        double area = calcularAreaTriangulo(base, altura);
        System.out.println("El area seria de " + area);


        scanner.close();
    }

    static  double calcularAreaTriangulo(int base, int altura) {
        return base * altura / 2d;
    }

}
