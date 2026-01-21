package UT3.ejRepaso.gimnasio;

public class socio {

    static int contadorSocios = 0;

    private String nombre;
    private int id;

    public socio(String nombre) {
        this.nombre= nombre;
        contadorSocios++;
        this.id = contadorSocios;
    }

    public static int getContadorSocios() {
        return contadorSocios;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }
}
