package UT4.herencia.ejHerencias2;

public class Moto extends VehiculosConMotor{

    private String tipo;

    public Moto(String color, String modelo, double precio, String marca, int cilindrada, int combustible, String tipo) {
        super(color, modelo, precio, marca, cilindrada, combustible);
        this.tipo = tipo;
    }

    public String toString() {
        return super.toString() + " y es de tipo " + tipo;
    }
}
