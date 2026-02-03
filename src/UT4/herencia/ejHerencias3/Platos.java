package UT4.herencia.ejHerencias3;

public class Platos {

    String nombre;
    int precio;

    public Platos(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString() {
        return "El nombre del plato es " + nombre + " y tiene un precio " + precio;
    }
}
