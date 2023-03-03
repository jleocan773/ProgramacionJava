package org.ieslosremedios.daw.examen_tema5.Ejercicio2;

public class Fichero implements Comparable{
    //Creamos los campos necesarios
    private String nombre;
    private Double tamaño;

    //Creamos el constructor para poder crear rápidamente archivos con nombre y tamaño
    public Fichero (String nombre, Double tamaño){
        this.nombre = nombre;
        this.tamaño = tamaño;
    }

    //Sobreescribimos el método toString para que se muestre como nosotros queremos
    @Override
    public String toString() {
        return this.nombre + " " + this.tamaño;
    }

    //Creamos los Getters y Setters
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

    @Override
    public int compareTo(Object o) {
        Fichero fichero2 = (Fichero) o;
        return ((Fichero) o).nombre.compareTo(fichero2.nombre);
    }

//    @Override
//    public int compareTo(Object o) {
//        Fichero fichero2 = (Fichero) o;
//        return ((Fichero) o).tamaño.compareTo(fichero2.tamaño);
//    }

}
