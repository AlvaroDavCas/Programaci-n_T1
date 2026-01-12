package UT3.Ejercicios1;

public class ejRectangulo {

    public static void main(String[] args) {

        rectangulo rectan = new rectangulo(3, 12);
        rectan.dimensiones();
        System.out.println("Área: " + rectan.area());
        System.out.println("Perímetro: " + rectan.perimetro());
        rectan.tipo();
        rectan.dibujoRectangulo();
    }
}
