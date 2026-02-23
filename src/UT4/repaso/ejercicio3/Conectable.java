package UT4.repaso.ejercicio3;

/*
Objetivo: Simular herencia múltiple mediante interfaces.
Tarea: Crea las interfaces Conectable (con métodos encender() y apagar())
y Recargable (con cargarBateria()).
Crea una clase Smartphone que implemente ambas y una clase Lampara que solo sea Conectable.
En el main, crea un array de tipo Conectable[] que contenga ambos objetos.
*/

public interface Conectable {

    public void encender();
    public void apagar();
}
