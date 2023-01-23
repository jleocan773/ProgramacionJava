package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.comparar;

import java.util.Arrays;

public class CompararArrays {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};

        System.out.println(a==b); //Aquí comparamos las referencias, son distintas referencias así que da false
        System.out.println(Arrays.equals(a,b)); //Aquí comparamos los valores, como son iguales da true

        a = b; //Aquí la referencia de "a" pasa a ser la misma referencia que "b", así que la referencia a "a" deja de
               // existir
        System.out.println(a==b); //Como la referencia de "a" ahora es la misma que "b", esto da true
        System.out.println(Arrays.equals(a,b)); //El contenido de ambas es el mismo, así que da true

        a[0] = 0;
        System.out.println(Arrays.equals(a,b)); //Hemos cambiado el valor de "a" pero como comparte referencia con "b"
                                                //realmente se ha cambiado el valor de ambas "a" y "b", por lo que da true

    }
}
