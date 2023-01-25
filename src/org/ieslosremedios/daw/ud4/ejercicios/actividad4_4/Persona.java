package org.ieslosremedios.daw.ud4.ejercicios.actividad4_4;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(){}

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Sobreescribimos el método toString para que devuelva una variable "definicion" con el nombre y la edad
    @Override
    public String toString(){
        this.nombre = nombre;
        this.edad = edad;
        String definicion = nombre + " tiene " + edad + " años";
        return definicion;
    }

}
