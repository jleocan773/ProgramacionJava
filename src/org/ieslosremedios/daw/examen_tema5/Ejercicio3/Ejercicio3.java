package org.ieslosremedios.daw.examen_tema5.Ejercicio3;


import java.util.Map;
import java.util.TreeMap;

public class Ejercicio3 {
        public static void main(String[] args) {

            //Creamos un array de números
            //El número 2 está tres veces,
            //El número 4 está tres veces
            //El número 6 está tres veces
            //El número 8 está dos veces
            //El número 10 está siete veces
            Integer[] numeros = {2, 4, 6, 6, 6, 4, 8, 10, 10, 10, 10, 10, 10, 10, 2, 2, 4, 8};
            contarOcurrencias(numeros);
        }

        //Creamos el método que contará las ocurrencias de cada número
        private static void contarOcurrencias(Integer[] numeros){
            //Creamos un mapa que será el que cuente las ocurrencias, guardará como clave el número del array y como valor
            //las ocurrencias del mismo. Elegimos TreeMap porque no admite valores nulos, y ordena de manera natural,
            //es decir, ordena de manera ascendente como pide el ejercicio
            Map<Integer, Integer> mapaContador = new TreeMap<>();
            //Con un bucle for each
            for (int key : numeros) {
                //Si el mapa contiene la clave, es decir, si NO ES la primera vez que la clave ha estado:
                if (mapaContador.containsKey(key)) {
                    //Obtenemos el valor de la clave y la igualamos a una variable "contador"
                    int contador = mapaContador.get(key);
                    //Aumentamos el valor de "contador" en 1
                    contador++;
                    //Y ponemos en la posición correspondiente el valor actualizado de "contador"
                    mapaContador.put(key, contador);
                 //De lo contrario, es decir, si es la primera vez que se encuentra la clave:
                } else {
                    //Colocamos la clave en la posición que toque y le ponemos como valor (como hemos dicho antes aquí se
                    //guarda las veces que ha aparecido la clave 1 (uno), ya que es la primera vez que se encuentra.
                    mapaContador.put(key, 1);
                }
            }
            //Mostramos con un bucle for each cada par de elementos del mapa
            for (Integer key : mapaContador.keySet()) {
                System.out.println("El número " + key + " está " + mapaContador.get(key) + " veces");
            }
    }
}


