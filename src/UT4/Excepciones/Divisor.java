package UT4.Excepciones;

public class Divisor {

    public static void main(String[] args) {
        try {
            double resultado = dividir(3, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Ha habido un error: " + e.getMessage());
        }

    }

    public static double dividir(double arriba, double abajo) {
        if (abajo == 0)
            throw new IllegalArgumentException("No se puede dividir por 0");
        return arriba / abajo;
    }
}
