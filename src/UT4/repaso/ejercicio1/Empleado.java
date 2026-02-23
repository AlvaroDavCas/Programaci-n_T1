package UT4.repaso.ejercicio1;

/*
Objetivo: Comprender la jerarquía básica y el uso de super().
Tarea: Crea una clase Empleado con nombre y sueldoBase. Luego, crea una subclase Gerente que añada un bono.
El constructor de Gerente debe usar super para inicializar los datos del padre.
Sobrescribe el metodo calcularSueldo() para sumar el bono en el caso del Gerente.
*/

public class Empleado {

    String nombre;
    double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    public double calcularSueldoBase() {
        return sueldoBase;
    }

}
