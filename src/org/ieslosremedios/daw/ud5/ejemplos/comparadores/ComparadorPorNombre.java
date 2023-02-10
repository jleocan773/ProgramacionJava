package org.ieslosremedios.daw.ud5.ejemplos.comparadores;
import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;
import java.util.Comparator;

public class ComparadorPorNombre implements Comparator<Persona> {

    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.nombre.compareTo(p2.nombre);
    }
}
