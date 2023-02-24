package org.ieslosremedios.daw.ud5.ejercicios.actividad_51;

import java.util.Comparator;

public class Comparador implements Comparator<Persona> {

    //Hacemos que el método "compare" haga la siguiente comprobación, si los nombres son iguales (lo cual hace con un "compareTo"), ordena primero el de
    //menor edad y después los ordena alfabéticamente
    @Override
    public int compare (Persona p1, Persona p2) {
        if (p1.getNombre().compareToIgnoreCase(p2.getNombre()) == 0){
            if (p1.getEdad() == p2.getEdad()){
            return 0;
            }
        if (p1.getEdad() > p2.getEdad()){
            return 1;
            }
        return -1;
        }
        return p1.getNombre().compareToIgnoreCase(p2.getNombre());
    }
}

