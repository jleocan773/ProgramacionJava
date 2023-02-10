package org.ieslosremedios.daw.ud5.ejemplos.hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploHashSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>(); //Creamos un conjunto de tipo String, inicializado a HashSet

        System.out.println(conjunto.isEmpty()); //Comprobamos con el método "isEmpty" si el conjunto está vacío

        String s1 = "Hola";
        conjunto.add(s1); //Hemos introducido al conjunto un elemento con el método "add"
        System.out.println(conjunto.isEmpty()); //Volvemos a comprobar si está vacío
        System.out.println(conjunto); //Pintamos por pantalla el contenido de conjunto

        //Metemos 4 elementos más, uno de los cuales va a estar repetido
        String s2 = "Buenas";
        String s3 = "Tardes";
        String s4 = "¿Cómo";
        String s5 = "Estás?";

        conjunto.add(s2); //Metemos varios elementos nuevos
        conjunto.add(s3);
        conjunto.add(s4);
        conjunto.add(s5);

        System.out.println(conjunto); //Imprimimos otra vez el conjunto. El conjunto no sigue un orden en concrecto

        conjunto.add(s3); //Este elemento no se va a introducir, porque ya existe

        System.out.println(conjunto); //Este Sout será igual al anterior

        conjunto.add(null); //Vamos a ver si el conjunto acepta valores nulos

        System.out.println(conjunto); //Y comprobamos que sí los acepta

        Iterator<String> it = conjunto.iterator(); //El método "iterator" crea un iterator y vamos a iniciarlo en "it"

        String e; //Crearemos esta variable String para imprimir los elementos con el "iterador"
        while(it.hasNext()){ //Mientras que el iterador tenga un elemento a continuación,
            e = it.next(); //Muestra el elemento en el que se encuentra
            System.out.print(e + " ");
        }

        conjunto.remove(s3); //Quitamos un elemento con el método "remove" e indicando el elemento a quitar
        System.out.println("\n" + conjunto); //Pintamos el conjunto, vemos que se ha eliminado s3


        Set<String> conjunto2 = new HashSet<>(); //Creamos un nuevo conjunto, de tipo Set y lo inicializamos con Hashset
        conjunto2.add(s1);
        conjunto2.add(s2);
        conjunto2.add(s3);
        conjunto2.add(s4);
        conjunto2.add(s5);
        System.out.println(conjunto2);

    }

}

