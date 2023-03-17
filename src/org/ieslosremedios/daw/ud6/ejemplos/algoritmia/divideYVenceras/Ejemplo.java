package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.divideYVenceras;

import java.util.Arrays;

public class Ejemplo {
    public static void main(String[] args) {
        int[] arrayNums = {-2,-1,3,5,8,10};
        int numParaBuscar = 8;
        int posicion = buscarNumero(arrayNums, numParaBuscar);

        System.out.println("El número " + numParaBuscar + " está en la posición " + posicion);
    }

    private static int buscarNumero(int[] arrayNums, int numParaBuscar) {
        int mitad = arrayNums.length / 2;
        if (numParaBuscar == arrayNums[mitad]){
            return mitad;
        }
        else if (numParaBuscar < arrayNums[mitad]) {
            return buscarNumero(Arrays.copyOfRange(arrayNums,0, mitad), numParaBuscar);
        }
        else return buscarNumero(Arrays.copyOfRange(arrayNums,mitad, arrayNums.length), numParaBuscar);
    }


}
