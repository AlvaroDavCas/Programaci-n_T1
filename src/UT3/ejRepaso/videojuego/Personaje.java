package UT3.ejRepaso.videojuego;

/*
Crea una clase Personaje
Atributos: nombre, nivel (int), puntosVida (int), esMagico (boolean).
Constructor: Inicializa el nombre y si es mágico. El nivel empieza en 1 y la vida en 100.
Lógica de Daño: Crea un metodo recibirDaño(int daño):
Si el personaje esMagico, el daño recibido se reduce un 20%.
Si después de recibir daño la vida baja de 0, se debe fijar en 0.
Lógica de Curación: Crea un metodo curar():
Si el nivel es menor de 5, recupera 10 puntos de vida.
Si el nivel es 5 o superior, recupera 25 puntos.
La vida nunca puede superar los 100 puntos.
*/

public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosVida;
    private boolean esMagico;

    public Personaje(String nombre, boolean esMagico) {
        this.nombre = nombre;
        this.nivel = 1;
        this.puntosVida = 100;
        this.esMagico = esMagico;
    }

    public void recibirDano(int dano) {
        if (!esMagico){
            puntosVida -= dano;
        } else {
            puntosVida -= (int) (dano * 0.80);
        }
        if (puntosVida <= 0){
            puntosVida = 0;
        }
    }

    public void curar() {
        if (nivel < 5) {
            puntosVida += 10;
        } else {
            puntosVida += 25;
        }

        if (puntosVida > 100) {
            puntosVida = 100;
        }
    }
}
