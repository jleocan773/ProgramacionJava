package org.ieslosremedios.daw.ud6.ejemplos.excepciones;

import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

public class NullPointer {
    public static void main(String[] args) {
        ejemplo();


    }

    private static void ejemplo(){
        String hola = null;
        hola.equals("null");
    }
}
