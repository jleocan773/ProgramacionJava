package org.ieslosremedios.daw.ud3.ejercicios.polimorfismo;

//Creamos la clase Leon que hereda de Animal
public class Leon extends Animal{

    //Sobreescribimos el método
    @Override
    public void speak() {
        System.out.println("Grrrrr");
    }

}
