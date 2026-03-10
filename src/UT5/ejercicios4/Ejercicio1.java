package UT5.ejercicios4;

import java.util.HashSet;

public class Ejercicio1 {

    public static void main(String[] args) {

        HashSet<String> invitados = new HashSet<>();

        invitados.add("Ana");
        invitados.add("Luis");
        invitados.add("Ana");
        invitados.add("Marta");
        invitados.add("Luis");

        System.out.println(invitados.size());
        System.out.println(invitados);

    }

}
