package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.buscar;

import java.util.Arrays;
 public class BusquedaArray {
        public static void main(String[] args) {
            int[] a = {1,3,7,10};
            System.out.println("Búsqueda manual: El número que buscas está en la posición -> " + buscar(a,7));
            System.out.println("Búsqueda de binarySearch: El número que buscas está en la posición -> " + Arrays.binarySearch(a,7));
        }

        private static int buscar(int[] a, int x) {
            for (int i = 0; i < a.length; i++) {
                if (x == a[i]) {
                    return i;
                }
            }
            return -1;
        }
    }

