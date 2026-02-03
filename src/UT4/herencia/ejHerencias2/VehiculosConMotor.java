package UT4.herencia.ejHerencias2;

public class VehiculosConMotor extends Vehiculos{

    int cilindrada;
    double combustible;

    public VehiculosConMotor(String color, String modelo, double precio, String marca, int cilindrada, double combustible) {
        super(color, modelo, precio, marca);
        this.cilindrada = cilindrada;
        this.combustible = combustible;
    }

    public String toString() {
        return super.toString() + " tiene una cilindrada de " + cilindrada + " y un combustible " + combustible;
    }
}
