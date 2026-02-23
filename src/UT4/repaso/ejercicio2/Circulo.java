package UT4.repaso.ejercicio2;

public class Circulo extends Figura {

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

}
