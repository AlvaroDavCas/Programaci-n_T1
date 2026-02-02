package UT4.herencia.ejHerencias2;

public class Vehiculos {
     String color;
     String modelo;
     double precio;
     String marca;

    public Vehiculos(String color, String modelo, double precio, String marca) {
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.marca = marca;
    }

    public String toString() {
        return "El coche es de color " + color + " del modelo " + modelo + " con un precio " + precio + " y de la marca " + marca;
    }
}
