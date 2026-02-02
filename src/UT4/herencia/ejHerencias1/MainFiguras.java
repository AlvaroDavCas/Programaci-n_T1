package UT4.herencia.ejHerencias1;

public class MainFiguras {
    public static void main(String[] args) {
        Figuras figura = new Figuras();
        System.out.println(figura);

        FiguraCuadrado cuadrado = new FiguraCuadrado(5);
        System.out.println(cuadrado);
    }
}
