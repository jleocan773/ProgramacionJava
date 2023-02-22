package org.ieslosremedios.daw.ud5.ejemplos.map;

import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
        Map<Integer, String> abecedario = new HashMap();
        abecedario.put(1,"A");
        abecedario.put(2, "B");
        abecedario.put(3, "C");
        abecedario.put(4, "D");
        abecedario.put(5, "E");

        //Pintamos el abecedario al completo
        System.out.println(abecedario);

        //Pintamos solo el valor de la llave 1
        System.out.println(abecedario.get(1));

        //Cambiamos el valor de la llave 4 a "F"
        abecedario.replace(4, "F");

        //Volvemos a pintar el abecedario completo
        System.out.println(abecedario);

        //Pintamos el valor de la llave 4
        System.out.println(abecedario.get(4));

        //Borramos el valor de la llave 4, el método "remove" devuelve el valor eliminado, podemos poner un sout
        System.out.println("Se ha eliminado el elemento: " + abecedario.remove(4));

        //Volvemos a pintar el abecedario completo
        System.out.println(abecedario);

        //Ifs para comprobar si está cierto valor y cierta clave

        if (!abecedario.containsValue("F")){
            System.out.println("Este abecedario no contiene la letra F");
        }
        else System.out.println("Este abecedario contiene la letra F");

        if (!abecedario.containsKey("1")){
            System.out.println("Este abecedario no contiene la clave 4");
        }
        else System.out.println("Este abecedario contiene la clave 4");

        //Iteramos sobre el conjunto de valores
        Iterator it = abecedario.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Iteramos sobre el conjunto de llaves
        it = abecedario.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //Para saber el tamaño
        System.out.println("El tamaño del array es: " + abecedario.size());


        System.out.println(abecedario.isEmpty());
        // Podemos limpiar el abecedario con "clear"
        abecedario.clear();
        System.out.println(abecedario);
        System.out.println(abecedario.isEmpty());



    }
}
