package UT4.herencia.ejHerencias2;

public class Bicicleta extends VehiculosSinMotor{

    private int marchas;

    public Bicicleta(String color, String modelo, double precio, String marca, String almacen, int marchas) {
        super(color, modelo, precio, marca, almacen);
        this.marchas = marchas;
    }

    public String toString() {
        return super.toString() + " y tiene un numero de marchas de " + marchas;
    }
}
