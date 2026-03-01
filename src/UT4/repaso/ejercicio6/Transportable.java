package UT4.repaso.ejercicio6;

public interface Transportable {

    public void viajar (double distancia, int combustible, int kiloMetros);

    public static void viajar(int combustible) throws CombustibleExcepcion {
        if (combustible <= 0) {
            throw new CombustibleExcepcion("Sin combustible");
        }
    }
}
