package org.ieslosremedios.daw.ud5.ejercicios.actividad_54;

import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
    RegistroLibros registroLibros = new RegistroLibros();
    registroLibros.insertarLibro("El Señor de Los Anillos", "J.R.R. Tolkien",  "29 de julio de 1954");
    registroLibros.insertarLibro("El Hobbit", "J.R.R. Tolkien",  "21 de septiembre de 1937");
    registroLibros.insertarLibro("Don Quijote de La Mancha", "Miguel de Cervantes",  "1605");


        List<Libro> matchingBooks = registroLibros.buscarTitulo("El Señor de Los Anillos");

        System.out.print("Libros encontrado: ");

        for (Libro libro : matchingBooks) {

            System.out.println(libro);

        }
    }
}
