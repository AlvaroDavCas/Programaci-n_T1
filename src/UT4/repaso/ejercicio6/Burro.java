package UT4.repaso.ejercicio6;

public class Burro implements Transportable {

    private String nombre;
    private int energia;
    private int energiaRestante;
    private boolean carga;

    public Burro(String nombre, boolean carga) {
        this.nombre = nombre;
        this.energia = 100;
        this.carga = carga;
    }

    public void descansar() {
        energia = 100;
    }

    @Override
    public void viajar(double distancia, int combustible, int kiloMetros) {
        energiaRestante = (int) (energia - (3 * distancia));
    }
}
