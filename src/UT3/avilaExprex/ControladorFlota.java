package UT3.avilaExprex;


public class ControladorFlota {

    public static void main(String[] args) {

        NaveEspacial[] control = new NaveEspacial[3];

        control[0] = new NaveEspacial("Ubuntu22");
        control[1] = new NaveEspacial("Ubuntu12", 20);
        control[2] = new NaveEspacial("Ubuntu24", 50);

        control[0].viajar(30);
        control[1].viajar(60);

        for (NaveEspacial naveEspacial : control) {
            naveEspacial.mostrarEstado();
        }

        control[0].repostar();
        control[0].mostrarEstado();

        int combustible1 = control[0].getCombustible();
        int combustible2 = control[1].getCombustible();
        int combustible3 = control[2].getCombustible();
        int mayor;
        if (combustible1 > combustible2 & combustible1 > combustible3) {
            mayor = 0;
        } else if (combustible2 > combustible1 & combustible2 > combustible3) {
            mayor = 1;
        } else {
            mayor = 2;
        }
        System.out.println("La nave con mas combustible es: ");
        control[mayor].mostrarEstado();

    }
}
