package org.ieslosremedios.daw.ud5.ejemplos.list;

import java.util.ArrayList;
import java.util.List;

public class ejemploLista1 {
    public static void main(String[] args) {
        //Creamos una lista y le damos valores
        List<String> coches = new ArrayList<>();
        coches.add("Volvo");
        coches.add("Mercedes");
        coches.add("BMW");
        coches.add("Ford");
        coches.add("Mazda");

        //Imprimimos toda la lista
        System.out.println(coches);
        //Imprimimos el tercer elemento (en la posición 2)
        System.out.println(coches.get(2));
        //Eliminamos un elemento, este método también pinta por pantalla el elemento quitado
        System.out.println(coches.remove(0));
        //Vemos que efectivamente se ha quitado el elemento
        System.out.println(coches);
        //Eliminamos un elemento por su nombre en lugar de por su posición, nos mostrará "true" porque se ha eliminado
        System.out.println(coches.remove("Ford"));
        //Vemos que se ha eliminado
        System.out.println(coches);
        //Cambiamos un valor por otro, devuelve el valor cambiado
        System.out.println(coches.set(0, "Hola"));
        //Vemos si se ha cambiado
        System.out.println(coches);
    }
}
