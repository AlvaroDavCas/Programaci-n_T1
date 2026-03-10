package UT5.ejercicios3;

import java.util.UUID;

public class Clientes {

    private String titulo;
    private String apellidos;
    private String direccion;
    private String email;
    private UUID codigoCliente;


    public Clientes(String titulo, String apellidos, String direccion, String email, UUID codigoCliente) {
        this.titulo = titulo;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
        this.codigoCliente = UUID.randomUUID();
    }
}
