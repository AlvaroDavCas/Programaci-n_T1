package UT4.herencia.ejHerencias3;

public class Platos {

    String nombre;
    double precio;

    public Platos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String toString() {
        return "El nombre del plato es " + nombre + " y tiene un precio " + precio;
    }
}
