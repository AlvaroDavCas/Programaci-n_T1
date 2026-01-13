package UT3.repasoPOO;

public class alumno {

    private String nombre;
    private double nota;

    public alumno(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void aprobar() {
        if (nota < 5) {
            nota = 5;
        }
    }

    public void imprimir() {
        System.out.println(nombre + " Tiene de nota: " + nota);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
