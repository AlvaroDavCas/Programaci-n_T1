package UT4.repaso.ejercicio2;

/*
Objetivo: Implementar métodos obligatorios en las hijas.
Tarea: Define una clase abstracta Figura con un atributo protected String color.
Añade un metodo abstracto double calcularArea(). Crea las clases Circulo (radio)
y Rectangulo (ancho y alto) que hereden de Figura e implementen el cálculo del área según su fórmula.
*/

abstract class Figura {

    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea();
}
