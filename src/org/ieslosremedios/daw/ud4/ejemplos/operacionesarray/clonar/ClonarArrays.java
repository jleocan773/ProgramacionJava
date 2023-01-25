package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.clonar;

import java.util.Arrays;

public class ClonarArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = a.clone(); //Parámetro implícito
        a[0] = 0; //Si se modifica el valor de a[0], no repercute en b[0], porque son diferentes

        System.out.print(Arrays.toString(a)); //Los valores son iguales porque "clone" en tipos primitivos copia valor
        System.out.println(a); //Pero las referencias no

        System.out.print(Arrays.toString(b)); //Los valores son iguales porque "clone" en tipos primitivos copia valor
        System.out.println(b); //Pero las referencias no, el clon tiene una nueva referencia

        }
}

