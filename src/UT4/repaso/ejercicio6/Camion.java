package UT4.repaso.ejercicio6;

public class Camion extends Vehiculos{

    private double cargaActual;
    private double capacidadMaxima;

    public Camion(String matricula, int kiloMetrosRecorridos, double cargaActual) {
        super(matricula, kiloMetrosRecorridos);
        this.cargaActual = cargaActual;
        this.capacidadMaxima = 5000;
    }

    @Override
    public void viajar(double distancia, int combustible, int kiloMetros) {

        setCombustibleRestantes((int) (combustible - 0.1 * distancia - (0.01 * cargaActual)));

    }
}