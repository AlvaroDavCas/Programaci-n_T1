package UT4.repaso.ejercicio6;

public class Autobus extends Vehiculos{

    private int pasajerosActuales;
    private int capacidadMaxima;


    public Autobus(String matricula, int kiloMetrosRecorridos, int pasajerosActuales) {
        super(matricula, kiloMetrosRecorridos);
        this.pasajerosActuales = pasajerosActuales;
        this.capacidadMaxima = 50;
    }

    @Override
    public void viajar(double distancia, int combustible, int kiloMetros) {
        setCombustibleRestantes((int) (combustible - 0.1 * distancia + (0.005 * pasajerosActuales)));
    }
}
