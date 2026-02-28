package UT4.Excepciones.ejercicio5;

public class Registro {
    public void registrarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad inválida: " + edad);
        }
        System.out.println("Edad registrada: " + edad);
    }
}
