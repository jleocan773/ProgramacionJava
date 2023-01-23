package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.buscar;
import java.util.Arrays;

public class BuscarArray {
    public static void main(String[] args) {
        int[] a = {1,3,7,10};
        System.out.println("Búsqueda manual: " + busquedaManual(a,7));
        System.out.println("Búsqueda binarySearch: " + Arrays.binarySearch(a,7)); //El binary search requiere que esté ordenado
    }

    private static int busquedaManual(int[] a, int n) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                return i;
            }
        }
        return -1;
    }
}