package org.ieslosremedios.daw.ud5.ejercicios.actividad_51;

import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

import java.util.Comparator;

public class Comparador implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p2.nombre.compareTo(p1.nombre);
    }
}
