package org.ieslosremedios.daw.ud5.ejemplos.practicapreexamen;

public class Persona implements Comparable{
    private String nombre;
    private Integer edad;

    Persona(String nombre, Integer edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Object o) {
        Persona persona2 = (Persona) o;
        return this.nombre.compareTo(persona2.nombre);
    }

    @Override
    public String toString() {
        return nombre + " tiene " + edad + " años";
    }
}
