package UT4.herencia.ejHerencias3;

public class Comanda {

    private Platos[] platos;
    private int contador;

    public Comanda(int cuantos) {
        platos = new Platos[cuantos];
        contador = 0;
    }

    public void addPlato(Platos p) {
        if (contador < platos.length) {
            platos[contador] = p;
            contador++;
        }
    }

    public int coste() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            total += platos[i].getPrecio();
        }
        return total;
    }

    public String toString() {
        return super.toString() + coste();
    }

}
