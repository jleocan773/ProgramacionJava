package org.ieslosremedios.daw.ud4.ejercicios.actividad4_4;

import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

public class MainPersona {
    public static void main(String[] args) {

        //Creamos tres variables personaX de tipo Persona, con el constructor que requiere nombre y edad como parámetro

        Persona persona1 = new Persona("Luis", 20);
        Persona persona2 = new Persona("Rafael", 25);
        Persona persona3 = new Persona("Pedro", 30);

        //Creamos un array de tipo Persona con los valores de persona1, persona2 y persona3
        Persona[] arrayPersonas = {persona1, persona2, persona3};

        //Si no hubiésemos sobreescrito este método, se iría al método "toString" de "Object" en lugar de irse al de
        //"Persona y sabemos que el método "toString" de "Object" muestra por pantalla la referencia.
        //Hemos sobreescrito el método "toString" en "Persona", indicando que devuelva el nombre y la edad

        for (Persona p: arrayPersonas) {
            System.out.println(p.toString());
        }

        //Vemos que muestra correctamente la variable que hemos definido en la sobrescritura del método, así que se
        //acaba mostrando por pantalla el nombre de personaX y su edad como pretendíamos
    }
}
