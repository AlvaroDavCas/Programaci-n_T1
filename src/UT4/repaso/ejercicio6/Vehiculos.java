package UT4.repaso.ejercicio6;

/*
Empresa de transporte.
Una compañía mixta utiliza vehículos motorizados y animales para diversas tareas. Diseña un programa en Java que modele esta flota usando herencia e interfaces,
permitiendo simular viajes y, en algunos casos, cargar mercancías o pasajeros.

Jerarquía de clases:

Interfaz Transportable. Tendrá un metodo viajar(double distancia), que resta combustible y suma kilómetros, y lanza una excepción si llega a cero el combustible.
Clase abstracta Vehículo con atributos para matrícula, kilómetros recorridos y combustible restante. Implementa Transportable.
Clases concretas que heredan de Vehículo:
Camión. Tiene los atributos cargaActual y capacidadMáxima (5000 kg). Además tiene un consumo de 0.1 litros/km + 0.01 litros por cada 1000 kg.
Autobús. Tiene los atributos pasajerosActuales y capacidadMáxima (50 pasajeros).
Además tiene un consumo de 0.08 litros/km + 0.005 litros por pasajero.
Clase burro. NO hereda de vehículo pero implementa Transportable. Tiene atributo para nombre, energía restante, y carga.
Tendrá un metodo para descansar que restaura la energía a 100.
Consumo: 3 unidades de energía por km.
El programa debe:

Crear un camión con 2000kg, un autobús con 20 pasajeros y un burro con carga.
Todos viajan 35km.
Muestra el consumo de combustible o si ha habido alguna incidencia (¿excepción?). ¿toString?
*/

abstract class Vehiculos implements Transportable {

    private String matricula;
    private int kiloMetrosRecorridos;
    private int combustibleRestantes;

    public Vehiculos(String matricula, int kiloMetrosRecorridos) {
        this.matricula = matricula;
        this.kiloMetrosRecorridos = kiloMetrosRecorridos;
    }

    public int getCombustibleRestantes() {
        return combustibleRestantes;
    }

    public void setCombustibleRestantes(int combustibleRestantes) {
        this.combustibleRestantes = combustibleRestantes;
    }
}
