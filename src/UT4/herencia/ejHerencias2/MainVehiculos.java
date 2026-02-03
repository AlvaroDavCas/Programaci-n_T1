package UT4.herencia.ejHerencias2;

public class MainVehiculos {

    public static void main(String[] args) {

        Bicicleta bicicleta = new Bicicleta("negro", "Montaña", 259.99, "MTB", "Garage", 6);
        System.out.println(bicicleta);

        Coches coches = new Coches("negro", "corsa", 10000, "Opel", 100, 2, 4);
        System.out.println(coches);

        Moto moto = new Moto("blanco", "125", 5000, "aprilia", 100, 1, "carretera");
        System.out.println(moto);

        Patinete patinete = new Patinete("gris", "125", 100, "patineitor", "Almacen", 2);
        System.out.println(patinete);
    }
}
