package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.insertar;
import java.util.Arrays;

public class InsertarArrayUltimaPosicion {


    public static void main(String[] args) {
        int n = 4; //Esta variable la uso para indicar la longitud del arrayOriginal
        int numeroNuevo = 11; //Esta variable será el número que quiero introducir en la última posición

        int[] arrayOriginal = { 7, 1, 5, 2}; //Creamos un array de tipo int[]
        System.out.println("Array original: " + Arrays.toString(arrayOriginal)); //Mostramos el array original

        arrayOriginal = insertarEnArray(n, arrayOriginal, numeroNuevo); //Hacemos que el contenido de "arrayOriginal" sea
                                                                        //el resultado del método insertarEnArray, que
                                                                        //ya tendrá el valor añadido

        //Mostramos el "arrayOriginal" una vez ha sido modificado con el método
        System.out.println("Array original con el número " + numeroNuevo + " añadido: " + Arrays.toString(arrayOriginal));
    }

    public static int[] insertarEnArray(int n, int[] a, int x) //Creamos el método "insertarEnArray"
                                                               // n será la longitud que tiene el array original
                                                               // int[a] será el array donde queremos introducir el valor
                                                               // x será el número que queremos introducir
        {
            int i;

            //Creamos un nuevo array que tendrá de longitud n (que indicará la longitud del array anterior)
            int[] arrayAdded = new int[n + 1];

            //Insertamos los valores del Array Original al Array Added
            for (i = 0; i < n; i++)
                arrayAdded[i] = a[i];

            arrayAdded[n] = x; //Pero a la última posición le ponemos el valor de x, que es el número que queremos poner

            return arrayAdded; //Se devuelve el array con el valor añadido
        }
}