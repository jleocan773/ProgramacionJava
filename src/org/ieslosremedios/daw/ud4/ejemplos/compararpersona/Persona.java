package org.ieslosremedios.daw.ud4.ejemplos.compararpersona;

//Modificaciones para UD5

import java.util.Objects;

public class Persona implements Comparable {
     public String nombre;
     public int edad;

     public Persona(String nombre) {
          this.nombre = nombre;
     }

     public Persona() {
     }

     public Persona(String nombre, int edad) {
          this.nombre = nombre;
          this.edad = edad;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public void setEdad(int edad) {
          this.edad = edad;
     }

     public String getNombre() {
          return nombre;
     }

     public int getEdad() {
          return edad;
     }

     @Override
     public String toString() {
          String definicion = this.nombre + " tiene " + this.edad + " años";
          return definicion;
     }

// compareTo Nombre
     @Override
     public int compareTo(Object other) {
          Persona otherPersona = (Persona) other; //Pasamos la variable "other" que es de tipo "Object" a tipo "Persona"
          return this.nombre.compareTo(otherPersona.nombre);
     }


// compareTo Edad
//     @Override
//     public int compareTo(Object other) {
//          Persona otherPersona = (Persona) other;
//          if (this.edad == otherPersona.edad){
//               return 0;
//          }
//          if (this.edad > otherPersona.edad){
//               return 1;
//          }
//          return -1;
//     }

//compareTo Nombre y Edad POR HACER COMENTAR EL DE ARRIBA  Y DEJAR ESTE
//     @Override
//     public int compareTo(Object other) {
//     Persona otherPersona = (Persona) other;
//     if (this.edad == otherPersona.edad){
//          return 0;
//     }
//     if (this.edad > otherPersona.edad){
//          return 1;
//     }
//     return -1;
//     }

     @Override
     public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;
          Persona persona = (Persona) o;
          return Objects.equals(nombre, persona.nombre);
     }
}
