package org.ieslosremedios.daw.ud5.ejemplos.comparadores;

import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploComparator {
    public static void main(String[] args) {
        Comparator<Persona> comparadorPorNombre = Comparator.comparing(Persona::getNombre);
        Set<Persona> personas = new TreeSet<>(comparadorPorNombre);
        Persona fran = new Persona("Ana", 20);
        Persona daniel = new Persona("Daniel", 12);
        personas.add(fran);
        personas.add(daniel);
        System.out.println(personas);
    }
}
