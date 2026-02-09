package UT4.herencia.ejHerencias3;

import java.util.Arrays;

public class MainRestaurante {

    public static void main(String[] args) {

        Comanda[] comanda = new Comanda[2];

        Platos[] comanda1 = new Platos[3];
        comanda1[0] = new Primeros("paella", 25.70, true);
        comanda1[1] = new Carnes("Entrecot", 21.99, "Al punto");
        comanda1[2] = new Postres("Panacota", 3.50, false);

        comanda[0] = new Comanda(1);

        Platos[] comanda2 = new Platos[4];
        comanda2[0] = new Primeros("Espaguetis", 8.99, false);
        comanda2[1] = new Carnes("Chuletón", 55.99, "Poco hecho");
        comanda2[2] = new Pescados("Dorada", 9.95);
        comanda2[3] = new Postres("Panacota", 3.50, false);


        comanda[1] = new Comanda(2);

        System.out.println(Arrays.toString(comanda1));
        System.out.println(Arrays.toString(comanda2));

    }
}
