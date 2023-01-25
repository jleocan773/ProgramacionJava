package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.llenar;
import java.util.Arrays;

public class LlenarArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        int b[] = new int [10];

        Arrays.fill(a, 5); //Esto llena completamente el método del valor indicado por parámetro
        System.out.println(Arrays.toString(a));

        Arrays.fill(b, 0, 4, 8); //Esto llena desde la posición 0 a la 4 con el valor indicado
        System.out.println(Arrays.toString(b));

    }
}
