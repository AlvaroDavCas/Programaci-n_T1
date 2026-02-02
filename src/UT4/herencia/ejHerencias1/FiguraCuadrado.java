package UT4.herencia.ejHerencias1;

public class FiguraCuadrado extends Figuras{

    private double lado;

    public FiguraCuadrado(double lado) {
        this.lado = lado;
    }

    public FiguraCuadrado(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    public double area() {
        return lado * lado;
    }

    public double perimetro() {
        return lado + lado + lado + lado;
    }

    public String toString() {
        return "El perimetro es de " + perimetro() + " y el area " + area();
    }
}
