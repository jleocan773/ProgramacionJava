package org.ieslosremedios.daw.ud5.ejemplos.practicapreexamen;

import java.util.Comparator;

public class Comparador implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
    if(o1.getNombre().compareTo(o2.getNombre()) == 0){
        if (o1.getEdad() == o2.getEdad()){
            return 0;
        }
        if (o1.getEdad() < o2.getEdad()){
            return 1;
        }
        else return -1;
    }
    return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
