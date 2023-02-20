package org.ieslosremedios.daw.ud5.ejercicios.actividad_51;
import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Persona ana = new Persona("Ana", 20);
        Persona pedro = new Persona("Pedro", 18);
        Persona riley = new Persona("Riley", 22);
        Persona paco = new Persona("Paco", 22);
        Persona berto = new Persona("Berto", 19);
        Persona luis = new Persona("Luis", 20);

        Set <Persona> conjuntoPersonas = new TreeSet<>();
        conjuntoPersonas.add(ana);
        conjuntoPersonas.add(pedro);
        conjuntoPersonas.add(riley);
        conjuntoPersonas.add(paco);
        conjuntoPersonas.add(berto);
        conjuntoPersonas.add(luis);


        System.out.println(conjuntoPersonas);
    }
}
