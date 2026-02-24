package UT4.Excepciones.ejercicio6;

public class DivisionSimple {

    public void realizarDivision(String numerador, String denominador) {

        try {
            int num = Integer.parseInt(numerador);
            int den = Integer.parseInt(denominador);
            if (den == 0) throw new ArithmeticException("Infinito");
            double division = (double) num / den;
            System.out.println("La división da " + division);
        } catch (NumberFormatException e) {
            System.out.println("Los números no están en un formato correcto");
        } catch (ArithmeticException e) {
            System.out.println("No podemos realizar la división");
        }
    }
}
