package UT3.biblioteca;

public class Libro {

    private String titulo;
    private Autor escritor;
    private boolean prestado;

    public Libro(String titulo, Autor escritor) {
        this.titulo = titulo;
        this.escritor = escritor;
        this.prestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getEscritor() {
        return escritor;
    }

    public void setEscritor(Autor escritor) {
        this.escritor = escritor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("Has alquilado: " + titulo);
        } else {
            System.out.println(titulo + " no está disponible");
        }
    }

    public void devolver() {
        prestado = false;
        System.out.println("El titulo " + titulo + "ha sido devuelto");
    }

    public void informacion() {
        System.out.println("El título " + titulo + " es de " + escritor.mostrarAutor());
    }
}
