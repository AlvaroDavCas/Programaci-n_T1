package UT4.herencia.ejHerencias2;

public class Patinete extends VehiculosSinMotor{

    private int numRuedas;

    public Patinete(String color, String modelo, double precio, String marca, String almacen, int numRuedas) {
        super(color, modelo, precio, marca, almacen);
        this.numRuedas = numRuedas;
    }

    public String toString() {
        return super.toString() + " y tiene " + numRuedas + " de ruedas";
    }
}
