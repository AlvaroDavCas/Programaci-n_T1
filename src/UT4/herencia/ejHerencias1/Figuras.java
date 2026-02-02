package UT4.herencia.ejHerencias1;

public class Figuras {

    private String color;


    public Figuras(String color) {
        this.color = color;
    }

    public Figuras() {
        this("negro");
    }

    public String toString() {
        return "Figura abstracto " + color;
    }
}
