package org.ieslosremedios.daw.ud4.ejemplos.compararpersona;

public class Persona {
     public String nombre;
     public int edad;

     public Persona(String nombre) {
          this.nombre = nombre;
     }

     public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
     }

     public String toString(){
          this.nombre = nombre;
          this.edad = edad;
          String definicion = nombre + " tiene " + edad + " años";
          return definicion;
     }

     public Persona(){}

}
