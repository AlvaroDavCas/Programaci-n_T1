package UT4.herencia.ejHerencias3;

import java.util.List;

public class Carnes extends Platos{

    String[] coccion;

    public Carnes(String nombre, int precio, String coccion) {
        super(nombre, precio);
        this.coccion = new String[]{"Poco hecho", "Al punto", "Muy hecho", "Carbonizado"};
    }

    public String toString() {
        return super.toString() + "El punto de coccion de la carne es" + coccion;
    }
}
