package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.ordenar;

import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] a = {5,60,25,1,40};
        System.out.println("Pintamos el array antes de ordenarlo: " + Arrays.toString(a));
        System.out.println("Búsqueda manual sin haberlo ordenado: " + buscar(a, 40));
        Arrays.sort(a); //Este método del Array ordena los números de menor a mayor, por lo que el número 1 (uno) pasará
                        // a la primera posición, es decir, la posición 0 (cero) del array; el número 5 (cinco) pasará a
                        // la segunda posición del array, es decir, la posición 1 (uno), y así con el resto.
        System.out.println("Pintamos el array ya ordenado: " + Arrays.toString(a));
        System.out.println("Búsqueda binaria tras haberlo ordenado: " + Arrays.binarySearch(a, 40)); //Necesita orden

    }
    private static int buscar(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                return i;
            }
        }
        return -1;
    }


}
