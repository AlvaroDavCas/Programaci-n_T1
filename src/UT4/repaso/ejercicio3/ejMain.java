package UT4.repaso.ejercicio3;

public class ejMain {

    public static void main(String[] args) {

        Conectable[] dispositivos = new Conectable[2];

        dispositivos[0] = new Smartphone();
        dispositivos[1] = new Lampara();

        for (Conectable c : dispositivos) {
            c.encender();
            c.apagar();
        }
    }
}
