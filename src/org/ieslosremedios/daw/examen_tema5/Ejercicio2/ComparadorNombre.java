package org.ieslosremedios.daw.examen_tema5.Ejercicio2;

import java.util.Comparator;

public class ComparadorNombre implements Comparator<Fichero> {
    @Override
    public int compare(Fichero o1, Fichero o2) {
        return o1.getNombre().compareToIgnoreCase(o2.getNombre());
    }

    @Override
    public Comparator<Fichero> reversed() {
        return Comparator.super.reversed();
    }


}
