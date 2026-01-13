package UT3.biblioteca;

public class Biblioteca {

    public static void main(String[] args) {

        Autor autor = new Autor("Miguel de Cervantes", "Española");
        Libro libro = new Libro("Don Quijote", autor);

        libro.prestar();
        libro.prestar();

        libro.informacion();

        libro.devolver();
    }
}
