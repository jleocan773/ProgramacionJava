package org.ieslosremedios.daw.ud5.ejemplos.listas;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ejemploLista2 {
    public static void main(String[] args) {
        //Creamos una lista y le damos valores
        List<String> coches = new ArrayList<>();
        coches.add("Volvo");
        coches.add("Mercedes");
        coches.add("BMW");
        coches.add("Ford");
        coches.add("Mazda");

        //Mostramos la lista
        System.out.println(coches);
        //Mostramos el elemento en la posición 2
        System.out.println(coches.get(2));
        //Cambiamos el valor de la posición 2
        coches.set(2, "Renault");
        //Mostramos la lista
        System.out.println(coches);
        //Quitamos el elemento en la posición 4
        coches.remove(4);
        //Mostramos la lista
        System.out.println(coches);
        //Añadimos el elemento "Opel" en la posición 3
        coches.add(3, "Opel");
        //Mostramos la lista
        System.out.println(coches);
        //Vaciamos la lista
        coches.removeAll(coches);
        //Comprobamos si está vacío
        System.out.println(coches.isEmpty());
        //Comprobamos el tamaño del array, si está vacío debería ser 0
        System.out.println(coches.size());

        //Creamos un conjunto y añadimos elementos a este para añadir a la lista de arriba
        Set<String> mascoches = new LinkedHashSet<>();
        mascoches.add("Mitchubichi");
        mascoches.add("Toyota");
        //Añadimos todos los elementos de este conjunto a la lista con el método "addAll"
        coches.addAll(mascoches);
        //Mostramos la lista
        System.out.println(coches);
    }
}
