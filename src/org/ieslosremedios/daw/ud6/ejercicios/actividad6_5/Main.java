package org.ieslosremedios.daw.ud6.ejercicios.actividad6_5;

import java.util.Arrays;

public class Main {
    private static final int N = 1000000;

    public static void main(String[] args) {
        int[] a = {-2, -1, 3, 5, 8, 10};
        int num = 5;
        long startTime = System.nanoTime();
        int pos = dyv(a, num);
        long endTime = System.nanoTime();

        System.out.println("BinarySearch -> El número " + num + " está en la posición: " + pos);
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
}
