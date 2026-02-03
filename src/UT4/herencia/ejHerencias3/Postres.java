package UT4.herencia.ejHerencias3;

public class Postres extends Platos{

    boolean azucar;

    public Postres(String nombre, int precio, boolean azucar) {
        super(nombre, precio);
        this.azucar = azucar;
    }

    public String toString() {
        return super.toString() + "Es posible comerlo si eres diabetico" + (azucar ? "Si" : "No");
    }
}
