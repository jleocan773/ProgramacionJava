package org.ieslosremedios.daw.ud6.ejemplos.algoritmia.divideYVenceras;

import java.util.Arrays;

public class EjemploBIEN {
    private static final int N = 1000000;

    public static void main(String[] args) {
        int[] a = {-2, -1, 3, 5, 8, 10};
        int num = 5;
        long startTime = System.nanoTime();
        int pos = dyv(a, num);
        long endTime = System.nanoTime();

        System.out.println("BinarySearch -> El número " + num + " está en la posición: " + pos);
        System.out.println("BinarySearch -> Tiempo: " + (endTime - startTime) + "ns");
        pos = lineal(a, num);
        endTime = System.nanoTime();
        System.out.println("LinearSearch -> El número " + num + " está en la posición: " + pos);
        System.out.println("LinearSearch -> Tiempo: " + (endTime - startTime) + "ns");
    }

    private static int dyv(int[] a, int num) {
        int pos = a.length / 2;

        if (a.length == 0) {
            return -1;
        } else if (num == a[pos]) {
            return pos;
        } else if (num > a[pos]) {
            return pos + 1 + dyv(Arrays.copyOfRange(a, pos + 1, a.length), num);
        } else {
            return dyv(Arrays.copyOfRange(a, 0, pos), num);
        }
    }

    public static int lineal(int[] a, int num) {
        int pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (num == a[i]) {
                pos = i;
                break;
            }
        }
        return pos;
    }
}