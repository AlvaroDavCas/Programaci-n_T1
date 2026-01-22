package UT3.Ejercicios3;

/*
Instancia dos Robots: "Mazinger" y "Optimus".
Muestra sus estadísticas iniciales.
Usa un bucle while que se repita mientras ambos estén vivos.
    En cada vuelta, el Robot 1 ataca al Robot 2.
    Si el Robot 2 sigue vivo, ataca al Robot 1.
    Muestra la vida restante de ambos tras cada asalto.
Al final, imprime quién ha ganado.
*/

public class Torneo {

    public static void main(String[] args) {

        Robot robot1 = new Robot("Mazinger", "Ubuntu");
        Robot robot2 = new Robot("Optimus", "Windows");

        robot1.mostrarEstadisticas();
        robot2.mostrarEstadisticas();

        int i = 1;
        while (robot1.estaVivo() && robot2.estaVivo()) {
            System.out.println("Ronda: " + i);
            robot1.atacar(robot2);
            if (robot2.estaVivo()) {
                robot2.atacar(robot1);
            }

            System.out.println("Estado tras la ronda " + i);
            robot1.mostrarEstadisticas();
            robot2.mostrarEstadisticas();

            i++;
        }

        if (robot1.estaVivo()) {
            System.out.println("El ganador es Mazinger");
        } else {
            System.out.println("El ganador es Optimus");
        }
    }
}
