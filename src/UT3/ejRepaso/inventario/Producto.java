package UT3.ejRepaso.inventario;

/*
Crea una clase Producto con:

Atributos: nombre (String), precio (double) y stock (int).
Un constructor que reciba los tres parámetros.
Métodos: vender(int cantidad) que reduzca el stock solo si hay suficiente, y reponer(int cantidad) que lo aumente.
Un metodo mostrarInfo() que imprima los datos formateados con printf.
*/

public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void vender(int cantidad){

        if (stock >= cantidad) {
            stock -= cantidad;
            System.out.println("La compra a sido realizada el Stock se ha reducido a " + stock);
        } else {
            System.out.println("No hay suficiente Stock");
        }
    }

    public void reponer(int cantidad) {
        stock += cantidad;
    }

    public void mostrarInfo() {
        System.out.printf(nombre + " Hay un stock de " + stock + " y tiene precio " + precio);
    }
}
