package org.ieslosremedios.daw.ud3.ejercicios.polimorfismo;

public class PrincipalAnimal {
    public static void main(String[] args) {

        Animal animal;

        System.out.println("LEÓN: ");
        animal = new Leon();
        animal.speak();

        System.out.println("\nPALOMA: ");
        animal = new Paloma();
        animal.speak();

        /* Podemos hacer un casting para indicarle al compilador que "Animal" será de tipo "Paloma" o bien podemos
        la variable pillará el método de fly de Paloma en tiempo de ejecución. */

        ((Paloma) animal).fly();

    }
}

