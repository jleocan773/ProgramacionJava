package org.ieslosremedios.daw.ud5.ejercicios.actividad_54;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class RegistroLibros {
    private final List<Libro> registroLibros;

    public RegistroLibros(){
        this.registroLibros = new ArrayList<>();
    }

    public void insertarLibro(String titulo, String autor, String fecha_pub){
        Libro nuevoLibro = new Libro(titulo, autor, fecha_pub);
        registroLibros.add(nuevoLibro);
        System.out.println("Se ha añadido el siguiente libro: " + nuevoLibro);
    }

    public List<Libro> buscarTitulo(String titulo) {
        List<Libro> libros = new ArrayList<>();
        for (Libro libro : registroLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                libros.add(libro);
            }
        }
        return libros;
    }

}
