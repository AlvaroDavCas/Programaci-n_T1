package UT4.herencia.ejHerencias1;

public class Circulo extends Figuras{

    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    @Override
    public String toString() {
        return "El circulo es de color negro ";
    }
}
