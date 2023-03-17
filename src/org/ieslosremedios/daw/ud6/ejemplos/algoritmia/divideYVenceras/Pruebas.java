package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.divideYVenceras;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        int[] arrayNums = {-2,-1,3,5,8,10};

        System.out.println("El número que buscas está en la posición: " + buscarNumero(arrayNums, 10, 0, arrayNums.length ));
    }

    private static int buscarNumero(int[] array, int num, int MinIN, int MaxIn) {
        int IndexOfMid = ((MinIN + MaxIn) / 2);
        int Midnum = array[IndexOfMid];
        if (MinIN > MaxIn) {
            return -1;
        }
        if (Midnum == num) {
            return IndexOfMid;
        }
        if (num < Midnum) {
            MaxIn = (IndexOfMid - 1);
        } else {
            MinIN = (IndexOfMid + 1);
        }
        return buscarNumero(array, num, MinIN, MaxIn);
    }
}
