package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.insertar;

import java.util.Arrays;

public class Insertar {
    public static void main(String[] args) {
        int[] arrayInt = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(insertarNuevoElemento(arrayInt, 666, 0)));


    }

    private static int[] insertarNuevoElemento(int[] arrayInt, int numInsertar, int pos) {
        int[] arrayPostInsercion = new int[arrayInt.length + 1];

        for (int i = 0; i < pos; i++) {
            arrayPostInsercion[i] = arrayInt[i];
        }
        arrayPostInsercion[pos] = numInsertar;
        for (int i = pos + 1; i < arrayPostInsercion.length; i++) {
            arrayPostInsercion[i] = arrayInt[i - 1];
        }
        return arrayPostInsercion;
    }
}

