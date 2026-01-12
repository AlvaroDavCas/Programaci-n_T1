package UT3.Ejercicios1;

/*
Un metodo constructor que no reciba ningún parámetro y que inicialice las dimensiones del rectángulo (largo y ancho) con dos enteros positivos por defecto.
Otro metodo constructor que reciba el ancho y el largo como parámetros.
Se debe chequear que ambos valores sean positivos antes de asignárselos a los atributos correspondientes. En caso contrario, se asignarán valores por defecto.
Métodos get y set para la clase. Los métodos set deben chequear que las nuevas dimensiones efectivamente sean enteros positivos.
Un metodo que calcule y retorne el área del rectángulo.
Metodo que calcule y retorne el perímetro del rectángulo.
Otro metodo que determine si el rectángulo es horizontal o vertical.
Decimos que el rectángulo es horizontal si el valor del largo es mayor que el del ancho. En caso contrario, decimos que el rectángulo es vertical.
Un metodo que despliegue en pantalla los valores de las dimensiones (largo y ancho) del rectángulo.
Otro metodo que dibuje en pantalla el rectángulo mediante asteriscos,
utilizando tantas columnas como valor tenga el largo y tantas filas como valor tenga el ancho.
Por ejemplo, si el ancho valiera 3 y el largo valiera 12,
se debería desplegar así:
************
************
************
 */

public class rectangulo {

    private int largo;
    private int ancho;

    public rectangulo(int ancho, int largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        if (largo > 0) {
            this.largo = largo;
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        if (ancho > 0) {
            this.ancho = ancho;
        }
    }

    public int area() {
        return ancho * largo;
    }

    public int perimetro() {
        return 2 * (ancho + largo);
    }

    public void tipo() {
        if (ancho > largo) {
            System.out.println("El rectangulo es vertical: ");
        } else if (largo > ancho) {
            System.out.println("El rectangulo es horizontal: ");
        } else {
            System.out.println("Es un cuadrado");
        }
    }

    public void dimensiones() {
        System.out.println("Largo: " + largo);
        System.out.println("Ancho: " + ancho);
    }

    public void dibujoRectangulo() {
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < largo; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "rectangulo{" +
                "largo=" + largo +
                ", ancho=" + ancho +
                '}';
    }
}
