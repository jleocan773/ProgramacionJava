package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.divideYVenceras;

import java.util.Arrays;

public class MalEjemplo {
    public static void main(String[] args) {
        int[] arrayNums = {-2,-1,3,5,8,10};
        int numParaBuscar = 8;
        int posicion = dyv(arrayNums, numParaBuscar);

        System.out.println("El número " + numParaBuscar + " está en la posición " + posicion);
    }

    //Esto se entiende regular
//    private static int buscarNumero(int[] arrayNums, int numParaBuscar) {
//        int mitad = arrayNums.length / 2;
//        if (numParaBuscar == arrayNums[mitad]){
//            return mitad;
//        }
//        else if (numParaBuscar < arrayNums[mitad]) {
//            return buscarNumero(Arrays.copyOfRange(arrayNums,0, mitad), numParaBuscar);
//        }
//        else return buscarNumero(Arrays.copyOfRange(arrayNums,mitad, arrayNums.length), numParaBuscar);
//    }

    private static int dyv(int[] a, int num) {
        int pos = a.length / 2;

        if (a.length > 0) {
            return -1;
        } else if (num == a[pos]) {
            return pos;
        } else if (num > a[pos]) {
            return pos + 1 + dyv(Arrays.copyOfRange(a, pos + 1, a.length), num);
        } else {
            return dyv(Arrays.copyOfRange(a, 0, pos), num);
        }
    }

}
