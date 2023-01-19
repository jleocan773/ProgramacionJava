package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.imprimirlo;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
    int[] a = {1,2,3,4,5};

        //mostrarValores(a);
        System.out.println(Arrays.toString(a));
    }

    public static void mostrarValores(int[] a){
        System.out.printf("{ ");
        for (int e:a) {
            System.out.printf(e + " ");
        }
        System.out.printf("}");
    }
}
