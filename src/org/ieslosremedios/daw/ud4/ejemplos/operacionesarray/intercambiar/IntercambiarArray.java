package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.intercambiar;

import java.util.Arrays;

public class IntercambiarArray {
    public static void main(String[] args) {
        int[] arrayParaIntercambiarPos = {1, 2, 3, 4, 5};
        int[] arrayParaDesplazar = {7, -2, 5, 0, 6};

        int[] arrayIntercambiado = intercambiarPosiciones(arrayParaIntercambiarPos, 3, 1);
        int[] arrayDesplazado = desplazarTodoDerecha(arrayParaDesplazar);

        int[] arrayBucleDesplazado = bucleDesplazarTodoDerecha(arrayParaDesplazar);

        System.out.println(Arrays.toString(arrayIntercambiado));
        System.out.println(Arrays.toString(arrayDesplazado));

        System.out.println("PRUEBA: " + Arrays.toString(arrayBucleDesplazado));

    }

    //Creamos el método "intercambiarPosiciones" que aceptará como parámetros un array "a", y las dos posiciones a
    // intercambiar

    private static int[] intercambiarPosiciones(int[] a, int pos1, int pos2) {
        //Creamos una variable para guardar el valor de "pos2", ya que este será sobreescrito al asignarle el valor de "pos1"
        int aux = a[pos2];
        //Asignamos a "pos2" el valor de "pos1".
        a[pos2] = a[pos1];
        //Asignamos a "pos1" el valor de "aux", que es el valor que tenía "pos2"
        a[pos1] = aux;

        return a;
    }

    private static int[] desplazarTodoDerecha(int[] a) {
        int aux1 = a[0];
        int aux2 = a[1];
        int aux3 = a[2];
        int aux4 = a[3];
        int aux5 = a[4];

        a[0] = aux5;
        a[1] = aux1;
        a[2] = aux2;
        a[3] = aux3;
        a[4] = aux4;

        return a;
    }

    private static int[] bucleDesplazarTodoDerecha(int[] a) {
        int aux = a[a.length-1];
        a[a.length] = a[0];

        for (int i = 0; i < a.length ; i++) {
            aux = a[i];
            a[i] = a[i - 1];
        }
        return a;
    }
}