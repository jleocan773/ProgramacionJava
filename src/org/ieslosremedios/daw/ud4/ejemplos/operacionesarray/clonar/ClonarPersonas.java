package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.clonar;
import org.ieslosremedios.daw.ud4.ejemplos.compararpersona.Persona;

import java.util.Arrays;

public class ClonarPersonas {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Luis", 20); //Creamos tres variables personaX de tipo Persona
        Persona persona2 = new Persona("Rafael", 25);
        Persona persona3 = new Persona("Pedro", 30);


        Persona[] arrayPersonas = {persona1, persona2, persona3}; //Metemos las tres variables en un array
        // System.out.print(Arrays.toString(arrayPersonas)); //Imprimimos el array, esto nos dará las referencias de cada
        System.out.print(Arrays.toString(arrayPersonas)); //Ahora que hemos sobreescrito el método toString, da valores
        System.out.println(arrayPersonas); //Esto nos imprime la referencia del array

        Persona[] arrayClones = arrayPersonas.clone();  // Creamos un nuevo array clon del array anterior

        /* Imprimimos el array, esto nos daría las referencias de cada,
        que serán iguales que las referencias del array anterior, porque
        "clone" ha clonado las referencias */

        //System.out.print(Arrays.toString(arrayClones));


        // Ahora que hemos sobreescrito el método toString en Persona, devuelve los nombres
        System.out.print(Arrays.toString(arrayClones));
        System.out.println(arrayClones); //En cambio, la referencia de este array es diferente al original


        // Si lo que queremos es imprimir el nombre de cada una de las variables "persona" introducidas, tendríamos que
        // hacer un bucle for each

        for (Persona p: arrayPersonas) {
            System.out.println(p.toString());
        }

    }
}
