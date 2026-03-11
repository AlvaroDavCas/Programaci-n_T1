package UT5.ejercicios3;

import java.util.UUID;

public class Videojuego {

    private String titulo;
    private String plataforma;
    private String genero;
    private int precio;
    private int stock;
    private UUID codigoIdentificador;


    public Videojuego(String titulo, String plataforma, String genero, int precio, int stock, UUID codigoIdentificador) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.codigoIdentificador = UUID.randomUUID();
    }

    public String getTitulo() {
        return titulo;
    }

    public UUID getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public int getStock() {
        return stock;
    }

    public void venderUnidad() {
        if (stock > 0) {
            stock --;
        }
    }
}
