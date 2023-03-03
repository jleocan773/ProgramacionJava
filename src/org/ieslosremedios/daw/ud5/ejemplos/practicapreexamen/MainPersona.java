package org.ieslosremedios.daw.ud5.ejemplos.practicapreexamen;

import java.util.TreeSet;

public class MainPersona {
    public static void main(String[] args) {
        Persona ana = new Persona("Ana", 20);
        Persona ana2 = new Persona("Ana", 24);
        Persona riley = new Persona("Riley", 22);
        Persona berto = new Persona("Berto", 18);
        Persona zoe = new Persona("Zoe", 19);
        Persona zoe2 = new Persona("Zoe", 25);

        TreeSet<Persona> personas = new TreeSet<>(new Comparador().reversed());

        personas.add(ana);
        personas.add(ana2);
        personas.add(riley);
        personas.add(berto);
        personas.add(zoe);
        personas.add(zoe2);

        System.out.println(personas);


    }
}
