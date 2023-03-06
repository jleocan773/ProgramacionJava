package org.ieslosremedios.daw.examen_tema5.Ejercicio3;

import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
    public static void main(String[] args) {

        Integer[] numeros = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        contarOcurrencias(numeros);
    }

    private static void contarOcurrencias(Integer[] numeros){
        //Creamos un mapa, el cual almacenará como clave el número que queremos saber cuantas veces se repite
        //y como valor el número de veces que se repite
        Map<Integer, Integer> mapaContador = new TreeMap<>();
        //Con un bucle for each:
        for (int key : numeros) {
            //Si el mapa contiene la clave, igualamos el valor del "contador" a la llave correspondiente, aumentamos el "contador" en uno e introducimos en el mapa
            //el par clave (número que queremos saber cuantas veces está) y el valor (contador de cuantas veces se ha repetido)
            if (mapaContador.containsKey(key)) {
                int contador = mapaContador.get(key);
                contador++;
                mapaContador.put(key, contador);
            }
            //De lo contrario, si es la primera vez que hemos encontrado el número, colocamos la clave y ponemos el valor a 1 (uno)
            else {
                mapaContador.put(key, 1);
            }
        }
        //Con un bucle for each mostramos cada elemento del mapa
        for (Integer key : mapaContador.keySet()) {
            System.out.print("El número " + key + " está " + mapaContador.get(key) + " vez/veces \n");
        }
    }
}


