package org.ieslosremedios.daw.examen_tema5.Ejercicio2;

import java.util.Comparator;

public class ComparadorTamaño implements Comparator<Fichero>{
    @Override
    public int compare(Fichero o1, Fichero o2) {
        return o1.getTamaño().compareTo(o2.getTamaño());
    }

    @Override
    public Comparator<Fichero> reversed() {
        return Comparator.super.reversed();
    }
}
