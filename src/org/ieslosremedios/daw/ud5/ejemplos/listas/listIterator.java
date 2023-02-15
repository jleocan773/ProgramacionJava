package org.ieslosremedios.daw.ud5.ejemplos.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class listIterator {
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

            //Creamos un ListIterator para recorrer el array
            ListIterator it = coches.listIterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
            //ListIterator además tiene un método "previous" que permite acceder al método anterior, cosa que no teníamos en SET
            while (it.hasPrevious()){
                System.out.println(it.previous());
            }

        }
}
