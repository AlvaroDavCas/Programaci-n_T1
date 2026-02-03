package UT4.herencia.ejHerencias2;

public class Coches extends VehiculosConMotor{

    private int puertas;

    public Coches(String color, String modelo, double precio, String marca, int cilindrada, int combustible, int puertas) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.puertas = puertas;
    }

    public String toString() {
        return super.toString() + " y un numero de puertas de " + puertas;
    }
}
