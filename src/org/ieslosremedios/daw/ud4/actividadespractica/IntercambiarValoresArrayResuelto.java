package org.ieslosremedios.daw.ud4.actividadespractica;

import java.util.Arrays;

public class IntercambiarValoresArrayResuelto {
    public static void main(String[] args) {
        int [] arrayNum = {1,2,3,4,5};

        arrayNum = intercambiarPosicionesArray(arrayNum, 0, 1);
        System.out.println(Arrays.toString(arrayNum));



    }

    //TODO Intercambia los valores de dos posiciones de un array
    // Si recuerdas, para ello tenemos que hacer uso de una variable auxiliar para conservar el valor de una de ellas
    // Crea un método que devuelva un array de tipo int, y si tiene que intercambiar dos posiciones, también deberá recibirlas como parámetros, ¿no?
    private static int[] intercambiarPosicionesArray(int[] array, int pos1, int pos2){
        int aux = array[pos1];
        array[pos1] = array[pos2];
        array[pos2] = aux;

        return array;
    }


}
