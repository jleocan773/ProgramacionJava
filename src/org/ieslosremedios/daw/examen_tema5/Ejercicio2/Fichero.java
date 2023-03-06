package org.ieslosremedios.daw.examen_tema5.Ejercicio2;

public class Fichero implements Comparable{
    private String nombre;
    private Double tamaño;

    public Fichero (String nombre, Double tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
    }
    @Override
    public String toString() {
        return nombre + " " + tamaño;
    }
//    @Override
//    public int compareTo(Object o) {
//        Fichero fichero2 = (Fichero) o;
//        return this.nombre.compareTo(fichero2.nombre);
//    }

    @Override
    public int compareTo(Object o) {
        Fichero fichero2 = (Fichero) o;
        return this.tamaño.compareTo(fichero2.tamaño);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }
}
