package org.ieslosremedios.daw.aaa_clases_universales;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.io.Serializable;

@Entity(name = "Persona")
public class Persona implements Serializable {
    public String nombre;
    @Transient
    public String apellidos;
    @Transient
    public int edad;
    @Transient
    public Persona padre;
    @Transient
    public Direccion direccion;


    public Persona(String nombre, String apellidos,  int edad, Persona padre, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.padre = padre;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellidos, Direccion direccion) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(){};

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return getNombre();
    }
}
