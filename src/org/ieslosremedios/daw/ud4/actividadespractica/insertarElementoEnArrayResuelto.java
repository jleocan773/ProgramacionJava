package org.ieslosremedios.daw.ud4.actividadespractica;

import java.util.Arrays;

public class insertarElementoEnArrayResuelto {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(addElemento(arrayInt, 0, 787877)));

    }

    //TODO Crea un método que introduzca un nuevo elemento en un array, para ello tendrás que hacer un clon del array que se le introduce como parámetro
    // este método tendrá como parámetro el array al cual se le meterá un elemento, en que posición se le  meterá el elemento, y que elemento (un numero cualquiera)

    private static int[] addElemento(int[] arrayNum, int posicion, int numero){
        int[] arrayIntroducido = new int[arrayNum.length + 1];


        //Recorro el array y doy los valores hasta antes de la posición
        for (int i = 0; i < posicion; i++){
            arrayIntroducido[i] = arrayNum[i];
        }

        //En la posición en la que se quiere introducir, pongo el número
        arrayIntroducido[posicion] = numero;

        //Asigno el resto de posiciones que falta, i vale pos+1 porque esa posición ya está asignada
        for (int i = posicion + 1; i < arrayIntroducido.length; i++){
            arrayIntroducido[i] = arrayNum[i-1];
        }

        return arrayIntroducido;
    }


}
