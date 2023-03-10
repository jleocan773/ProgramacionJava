package org.ieslosremedios.daw.ud5.practica;

//Modificaciones para UD5

public class Persona implements Comparable {
    private String nombre;
    private int edad;
    private String apellidos;


    // Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {return edad;}
    public String getApellidos() {
        return apellidos;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Constructores
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public Persona() {}
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Método toString
    @Override
    public String toString() {
        return this.nombre;
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
}
