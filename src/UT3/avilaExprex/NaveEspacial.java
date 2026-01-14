package UT3.avilaExprex;

public class NaveEspacial {

    private String nombre;
    private int combustible;
    private double capacidadCarga;
    private boolean enMision;


    public NaveEspacial(String nombre, double capacidadCarga) {
        this.nombre = nombre;
        this.capacidadCarga = capacidadCarga;
        this.combustible = 100;
        this.enMision = false;
    }

    public NaveEspacial(String nombre) {
        this.nombre = nombre;
        this.capacidadCarga = 6;
        this.combustible = 100;
        this.enMision = false;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        if(combustible >= 0 && combustible <= 100) {
            this.combustible = combustible;
        }
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isEnMision() {
        return enMision;
    }

    public void setEnMision(boolean enMision) {
        this.enMision = enMision;
    }

    public void viajar(int distancia) {
        if (combustible - (distancia * 2) > 0) {
            combustible -= distancia * 2;
            System.out.println("Cantidad restante de combustible " + combustible + " de la nave " + nombre);
            enMision = true;
        } else {
            System.out.println("Combustible insuficiente para la mision");
        }
    }

    public void repostar() {
        combustible = 100;
        enMision = false;
    }

    public void mostrarEstado() {
        System.out.println("La nave llamada " + nombre + ", tiene un combustible repostado de " + combustible + " y una capacidad de carga de " + capacidadCarga + " Toneladas " + " y esta en mision: " + enMision);
    }
}
