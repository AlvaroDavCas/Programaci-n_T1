package UT4.repaso.ejercicio1;

public class Gerente extends Empleado {

    private double bono;

    public Gerente(String nombre, double sueldoBase, double bono) {
        super(nombre, sueldoBase);
        this.bono = bono;
    }

    @Override
    public double calcularSueldoBase() {
        return  sueldoBase + bono;
    }
}
