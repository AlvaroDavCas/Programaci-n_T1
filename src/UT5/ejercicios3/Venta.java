package UT5.ejercicios3;

import java.time.LocalDate;
import java.util.List;

public class Venta {

    Clientes clientes;
    List<Videojuego> videojuego;
    private LocalDate fechaVenta;

    public Venta(Clientes clientes, List<Videojuego> videojuego, LocalDate fechaVenta) {
        this.clientes = clientes;
        this.videojuego = videojuego;
        this.fechaVenta = fechaVenta;
    }
}
