package org.ieslosremedios.daw.ud3.ejercicios.polimorfismo;

public class Paloma extends Animal implements Volador{

    @Override
    public void fly() {
        System.out.println("Puedo volar porque soy un pájaro");
    }

    @Override
    public void speak(){
        System.out.println("Pio pio pio");
    }

}
