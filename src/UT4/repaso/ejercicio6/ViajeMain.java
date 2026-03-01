package UT4.repaso.ejercicio6;

public class ViajeMain {

    public static void main(String[] args) {

        Camion camion1 = new Camion("456123KL", 35, 2000);
        Autobus autobus1 = new Autobus("5468213ASD", 35, 20);
        Burro burro1 = new Burro("Manolito", true);

        System.out.println(camion1.getCombustibleRestantes());
    }
}
