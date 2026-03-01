package UT4.repaso.ejercicio5;

/*
Jerarquía: Crea la clase abstracta ModuloControl y la subclase Reactor.
Excepción: Crea EnergiaCriticaException (comprobada/checked).
Lógica: El metodo inyectarCombustible(int cantidad) en Reactor debe lanzar
la excepción si la cantidad es negativa o si el sistema supera los 100 grados.
Main: Crea un objeto Reactor, intenta inyectar combustible y usa un bloque try-catch-finally
para manejar el error y asegurar que se imprima siempre el "Estado de seguridad" en el finally
*/

abstract class ModuloControl {

    public abstract void inyectarCombustible(int cantidad) throws EnergiaCriticaException;
}
