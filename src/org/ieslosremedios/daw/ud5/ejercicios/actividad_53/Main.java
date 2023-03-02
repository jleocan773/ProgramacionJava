package org.ieslosremedios.daw.ud5.ejercicios.actividad_53;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // El 1 está cuatro veces || El 2 está dos veces || El 3 está dos veces
        // El 4 está dos veces || El 5 está dos veces || El 6 está una vez

        Integer[] numeros = {1, 2, 3, 3, 5, 6, 1, 1, 2, 5, 4, 4, 1};

        contarOcurrencias(numeros);

    }

        private static void contarOcurrencias(Integer[] numeros){
        //Primero vamos a hacer uso de un mapa que guardará los números del array como llave y las ocurrencias de estos como valor
        Map<Integer, Integer> mapaContador = new TreeMap<Integer, Integer>();

        //Creamos un bucle que se ejecutará hasta recorrer el array
        for (int i = 0; i < numeros.length; i++)
        {
            //Guardamos en un variable de tipo int el número en la posición "i" del array
            int key = numeros[i];
            //Si la clave ya se encuentra en el mapa, se ejecuta lo siguiente:
            if (mapaContador.containsKey(key))
            {
                //Creamos un contador
                int contador = mapaContador.get(key);
                //Incrementamos el contador en uno
                contador++;
                //Y guardamos el elemento como llave y el contador como valor
                mapaContador.put(key, contador);
            }   //De lo contrario, si es la primera vez que se encuentra esa clave, ponemos el contador de esa llave en 1
                else
            {
                mapaContador.put(key, 1);
            }
        }
            //Usamos un iterator para mostrar el número de veces que cada número está
            Iterator<Integer> itElementos = mapaContador.keySet().iterator();
            while(itElementos.hasNext()){
                Integer key = itElementos.next();
                System.out.print("El número " + key + " está " + mapaContador.get(key) + " vez/veces \n");
            }
    }
}
