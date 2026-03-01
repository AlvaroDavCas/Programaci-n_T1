package UT4.repaso.ejercicio5;

public class Reactor extends ModuloControl {

    private int temperatura;

    public Reactor(int temperatura) {
        this.temperatura = temperatura;
    }

    public void inyectarCombustible(int cantidad) throws EnergiaCriticaException {
        if (cantidad < 0) {
            throw new EnergiaCriticaException("No hay combustible");
        }

        if (temperatura >= 100) {
            throw new EnergiaCriticaException("La temperatura esta superando limites criticos. El reactor esta a " + temperatura + " grados");
        }
    }
}
