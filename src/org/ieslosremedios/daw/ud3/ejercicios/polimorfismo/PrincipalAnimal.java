package org.ieslosremedios.daw.ud3.ejercicios.polimorfismo;

public class PrincipalAnimal {
    public static void main(String[] args) {

        //Creamos una variable "animal" de tipo Animal
        Animal animal;

        System.out.println("LEÓN: ");
        //Asignamos a la variable "animal" el valor de una instancia de "Leon"
        animal = new Leon();
        //Cuando se ejecute esto, pillará el método de "Leon", no de "Animal"
        animal.speak();

        System.out.println("\nPALOMA: ");
        //Asignamos a la variable "animal" el valor de una instancia de "Paloma", sustituyendo a la instancia de "Leon"
        animal = new Paloma();
        //Cuando se ejecute esto, pillará el método de "Paloma", no de "Animal"
        animal.speak();

        /* Podemos hacer un casting para indicarle al compilador que "Animal" será de tipo "Paloma", es decir, que
        la variable pillará el método "fly" de "Paloma" en tiempo de ejecución. */

        ((Paloma) animal).fly();

    }
}

