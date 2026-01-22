package UT3.Ejercicios3;

public class Robot {

    /*
    nombre (String).
    modelo (String).
    vida (double): Empieza en 100.0 (tope máximo).
    potenciaAtaque (double): Valor entre 10 y 20.
    blindaje (double): Valor entre 0 y 10 (reduce el daño recibido).
    */

    private String nombre;
    private String modelo;
    private double vida;
    private double potenciaAtaque;
    private double blindaje;

    /*
    Constructor principal que recibe nombre y modelo. La vida se fija a 100.
    La potenciaAtaque y el blindaje deben generarse aleatoriamente dentro del constructor respetando los rangos indicados.
    */

    public static final double potenciaAtaqueMin = 10;
    public static final double potenciaAtaqueMax = 20;
    public static final double blindajeMin = 0;
    public static final double blindajeMax = 10;

    public Robot(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.vida = 100;
        this.potenciaAtaque = Math.random() * (potenciaAtaqueMax - potenciaAtaqueMin) + potenciaAtaqueMin;
        this.blindaje = Math.random() * (blindajeMax - blindajeMin) + blindajeMin;
    }

    /*
    mostrarEstadisticas(): Imprime nombre, vida, ataque y defensa con formato bonito (puedes usar printf ).
    recibirDano(double cantidad):
        El daño real es cantidad - blindaje.
        Si el daño real es menor que 0, no pierde vida (el blindaje lo paro odo).
        Restar daño real a la vida. Si la vida baja de 0, se queda en 0.
    atacar(Robot enemigo):
        Este metodo recibe otro objeto Robot como parámetro.
        Si el robot atacante tiene 0 de vida, imprime "El robot X está destruido y no puede atacar".
        Si el enemigo ya tiene 0 de vida, imprime "El enemigo ya está vencido".
        Si ambos pueden luchar: Llama al metodo recibirDano del objeto enemigo pasándole la potenciaAtaque del atacante.
    estaVivo(): Devuelve true si vida > 0.
    */

    public void mostrarEstadisticas() {
        System.out.printf("Nombre: %s. Vida: %.2f. Ataque %.2f. Defensa %.2f. \n", nombre, vida, potenciaAtaque, blindaje);
    }

    public void recibirDano(double cantidad) {
        double danoReal = cantidad - blindaje;

        if (danoReal < 0) {
            System.out.println("El blindaje para el golpe");
        } else {
            vida -= danoReal;
        }
        if (vida <= 0) {
            vida = 0;
        }
    }

    public void atacar(Robot enemigo) {
        if (!this.estaVivo()) {
            System.out.println("El robot " + nombre + " esta destruido y no puede atacar");
        }

        if (!enemigo.estaVivo()) {
            System.out.println("El enemigo ya esta vencido");
        }

        System.out.println(nombre + " ataca a " + enemigo.nombre);
        enemigo.recibirDano(this.potenciaAtaque);
    }

    public boolean estaVivo() {
        if (vida > 0) {
            return true;
        } else {
            return false;
        }
    }
}
