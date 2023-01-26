package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.copiar;
import java.util.Arrays;

public class CopiarArrays {
    public static void main(String[] args) {

        //Creamos un array de tipo int
        int a[] = {1, 2, 3};
        //Creamos una copia de ese array, indicando la longitud completa 3 (tres) aunque podemos poner 2 (dos) o 1 (uno)
        //y no se copiaría completamente
        int b[] = Arrays.copyOf(a, 3);

        //Con un bucle for each mostramos todos los valores de a
        for (int i : a) {
            System.out.print(i + " ");
            }

        //Dejamos una línea en blanco para que quede bonito
        System.out.println();

        //Con un bucle for each mostramos todos los valores de b
        for (int i : b) {
            System.out.print(i + " ");
            }
    }
}


