package org.ieslosremedios.daw.ud5.ejercicios.actividad_51;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Persona ana = new Persona("Ana", 20);
        Persona ana2 = new Persona("Ana", 24);
        Persona riley = new Persona("Riley", 22);
        Persona berto = new Persona("Berto", 18);
        Persona zoe = new Persona("Zoe", 19);
        Persona zoe2 = new Persona("Zoe", 25);

        TreeSet<Persona> conjuntoPersonas= new TreeSet<>(new ComparadorInverso().reversed());

        conjuntoPersonas.add(riley);
        conjuntoPersonas.add(ana);
        conjuntoPersonas.add(zoe);
        conjuntoPersonas.add(ana2);
        conjuntoPersonas.add(berto);
        conjuntoPersonas.add(zoe2);


        System.out.println(conjuntoPersonas);
    }
}
