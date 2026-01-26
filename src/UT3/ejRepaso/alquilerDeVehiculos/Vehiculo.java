package UT3.ejRepaso.alquilerDeVehiculos;

/*
Escribe una clase Vehiculo con los atributos: modelo, tarifaBase (diaria), esElectrico (boolean) y diasAlquiler.
Crea un metodo calcularPrecioFinal() que aplique las siguientes reglas:

Precio inicial: tarifaBase * diasAlquiler.
Descuento por duración: * Si se alquila más de 7 días, se aplica un 10% de descuento sobre el total.
Si se alquila más de 15 días, el descuento es del 20%.
Bono Ecológico: Si esElectrico es true, se restan 15€ al total final (siempre que el total sea mayor a 15€).
Tasa Joven: El metodo debe recibir la edad del conductor.
Si es menor de 25 años, se suma un recargo de 50€ por concepto de seguro de riesgo.
*/

public class Vehiculo {
    private String modelo;
    private int tarifaBase;
    private boolean esElectrico;
    private int diasAlquiler;

    public Vehiculo(String modelo, int tarifaBase, boolean esElectrico, int diasAlquiler) {
        this.modelo = modelo;
        this.tarifaBase = tarifaBase;
        this.esElectrico = esElectrico;
        this.diasAlquiler = diasAlquiler;
    }

    public double calcularPrecioFinal(int edadConductor) {
        double total = precioInicial();
        total -= descuentoDuracion();
        total -= ecologico(total);
        total += tasaJoven(edadConductor);
        return total;
    }

    public int precioInicial() {
        return tarifaBase * diasAlquiler;
    }

    public int descuentoDuracion() {
        if (diasAlquiler > 15){
            return (int) (precioInicial() * 0.20);
        } else if (diasAlquiler > 7) {
            return (int) (precioInicial() * 0.10);
        } else {
            return 0;
        }
    }

    public int ecologico(double total) {
        if (esElectrico && total > 15) {
            return 15;
        } else {
            return 0;
        }
    }

    public double tasaJoven(int edadConductor) {
        if (edadConductor < 25) {
            return 50;
        } else {
            return 0;
        }
    }
}
