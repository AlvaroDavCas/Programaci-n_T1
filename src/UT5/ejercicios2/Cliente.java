package UT5.ejercicios2;

public class Cliente {

    private int numeroCarnet;
    private String titulo;

    public Cliente(int numeroCarnet, String titulo) {
        this.numeroCarnet = numeroCarnet;
        this.titulo = titulo;
    }

    public int getNumeroCarnet() {
        return numeroCarnet;
    }

    public void setNumeroCarnet(int numeroCarnet) {
        this.numeroCarnet = numeroCarnet;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
