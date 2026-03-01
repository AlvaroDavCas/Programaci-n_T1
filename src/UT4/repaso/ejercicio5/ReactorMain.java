package UT4.repaso.ejercicio5;

public class ReactorMain {

    public static void main(String[] args) {

        Reactor reactor = new Reactor(110);

        try {
            reactor.inyectarCombustible(50);
            reactor.inyectarCombustible(-60);
        } catch (EnergiaCriticaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Estado de seguridad");
        }
    }
}
