package UT4.herencia.ejHerencias2;

public class VehiculosSinMotor extends Vehiculos{

    private String almacen;

    public VehiculosSinMotor(String color, String modelo, double precio, String marca, String almacen) {
        super(color, modelo, precio, marca);
        this.almacen = almacen;
    }

    public String toString() {
        return super.toString() + " esta almacenada ";
    }
}
