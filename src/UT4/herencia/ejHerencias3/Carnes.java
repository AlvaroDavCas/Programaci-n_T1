package UT4.herencia.ejHerencias3;

public class Carnes extends Platos{

    String[] coccion = {"Poco hecho", "Al punto", "Muy hecho", "Carbonizado"};

    private int estado;

    public Carnes(String nombre, double precio, String coccion) {
        super(nombre, precio);
        if (estado >= 0 && estado < coccion.length()) {
            this.estado = estado;
        } else {
            this.estado = 1;
        }
    }

    public String toString() {
        return super.toString() + "El punto de coccion de la carne es" + coccion[estado];
    }
}
