package UT4.herencia.ejHerencias3;

public class Primeros extends Platos{

    boolean compartir;

    public Primeros(String nombre, int precio, boolean compartir) {
        super(nombre, precio);
        this.compartir = compartir;
    }

    public String toString() {
        return super.toString() + " El plato es " + ((compartir) ? "Es para compartir" : "No es para compartir");
    }
}
