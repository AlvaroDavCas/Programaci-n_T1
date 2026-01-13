package UT3.repasoPOO;

public class movil {

    private String marca;
    private int bateria;
    private boolean estaBloqueado;

    public movil(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    public movil() {
        this("Generico",100);
    }

    static void llamar() {
        System.out.println("llamando...");
    }
}
