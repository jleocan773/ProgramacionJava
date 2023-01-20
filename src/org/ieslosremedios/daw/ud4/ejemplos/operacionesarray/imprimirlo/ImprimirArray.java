package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.imprimirlo;

public class ImprimirArray {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};

        mostrarValores(a);
        // System.out.println(Arrays.toString(a));
    }

    public static void mostrarValores(int[] a) {
        for (int e : a) {
            if (e == a[0]) {System.out.printf("{" + e + ", "); }
            else if (e < a.length) {System.out.printf(e + ", ");}
            else System.out.print(e + "}");
        }
    }
}