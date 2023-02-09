package org.ieslosremedios.daw.ud4.ejercicios.actividad4_5;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //TODO 1.- A continuación de la actividad A4.3. continúa creando los siguientes métodos:
        // Un método que recibe un array de enteros, un elemento entero y una posición. Devuelve otro array que será
        // una copia del array de entrada pero insertando un nuevo elemento (el indicado en los parámetros) en la
        // posición indicada. Ahora sobrecarga el método para que reciba en lugar de un elemento entero un elemento que
        // sea otro array de enteros. Habrá que insertar los elementos de este array empezando desde la posición.

        System.out.println("-----------------------------------");
        System.out.println("Apartado 1: ");

        int[] arrayParaInsertar = {1, 2, 3, 4};
        System.out.println("Antes de la inserción: " + Arrays.toString(arrayParaInsertar));
        arrayParaInsertar = insertarNuevoElemento(arrayParaInsertar, 25, 0);
        System.out.println("Después de la inserción: " + Arrays.toString(arrayParaInsertar));


        int[] otroArrayParaInsertar = {5, 6 ,7 ,8};
        int[] arrayQueSeInsiertaEnElDeArriba = {9, 10, 11, 12};
        System.out.println("Antes de insertar el otro Array: " + Arrays.toString(otroArrayParaInsertar));
        otroArrayParaInsertar = insertarNuevoElemento(otroArrayParaInsertar, arrayQueSeInsiertaEnElDeArriba, 2);
        System.out.println("Después de insertar el otro Array: " + Arrays.toString(otroArrayParaInsertar));

        System.out.println("-----------------------------------");

        System.out.println("Apartado 2: ");
        int [] arrayParaEliminar = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Antes de eliminar: " + Arrays.toString(arrayParaEliminar));
        eliminarNumArray(arrayParaEliminar, 2, true); //Esto solo funciona bien con el true, no conseguí hacerlo con false
        System.out.println("Después de eliminar: " + Arrays.toString(arrayParaEliminar));

        System.out.println("-----------------------------------");

        System.out.println("Apartado 3: ");
        int[] arrayParaCambiarParEImpares = {5,6,7,8,9,10};
        System.out.println("Antes de intercambiar posiciones: " + Arrays.toString(arrayParaCambiarParEImpares));
        arrayParaCambiarParEImpares = cambiarParAImpar(arrayParaCambiarParEImpares);
        System.out.println("Después de intercambiar posiciones: " + Arrays.toString(arrayParaCambiarParEImpares));

    }

    //TODO 1.- A continuación de la actividad A4.3. continúa creando los siguientes métodos:
    // Un método que recibe un array de enteros, un elemento entero y una posición. Devuelve otro array que será
    // una copia del array de entrada pero insertando un nuevo elemento (el indicado en los parámetros) en la
    // posición indicada.

    private static int[] insertarNuevoElemento(int[] arrayInt, int numInsertar, int pos) {
        int[] arrayPostInsercion = new int[arrayInt.length + 1];

        for (int i = 0; i < pos; i++) {
            arrayPostInsercion[i] = arrayInt[i];
        }
        arrayPostInsercion[pos] = numInsertar;

        for (int i = pos + 1; i < arrayPostInsercion.length; i++) {
            arrayPostInsercion[i] = arrayInt[i - 1];
        }
        return arrayPostInsercion;
    }

    //TODO Ahora sobrecarga el método para que reciba en lugar de un elemento entero un elemento que
    // sea otro array de enteros. Habrá que insertar los elementos de este array empezando desde la posición.

    private static int[] insertarNuevoElemento(int[] arrayInt, int[] arrayParaInsertar, int pos) {
        int[] arrayPostInsercion = new int[arrayInt.length + arrayParaInsertar.length];

        for (int i = 0; i < pos; i++) {
            arrayPostInsercion[i] = arrayInt[i];
        }
        for (int i = 0; i < arrayParaInsertar.length; i++ ){
            arrayPostInsercion[pos + i] = arrayParaInsertar[i];
        }
        for (int i = pos + arrayParaInsertar.length; i < arrayPostInsercion.length; i++) {
            arrayPostInsercion[i] = arrayInt[i - arrayParaInsertar.length];
        }
        return arrayPostInsercion;
    }

    //TODO 2.- Un método que recibe un array de enteros, un elemento entero y un booleano. Devuelve un nuevo array que será
    // una copia del array de entrada pero eliminado el elemento si existe. Para ello deberá de buscarlo previamente.
    // La eliminación podrá ser lógica o física, esto es, si el booleano es true, se hará el borrado lógico, con lo que se
    // pondrá el valor del elemento en el array a 0, mientras que si el booleano es false, se hará borrado físico,
    // eliminado el elemento del array quedando el array con una posición menos.

        public static int[] eliminarNumArray (int[] arrayInt, int numParaBorrar, boolean borradoLogico ) {
            if (borradoLogico == true){
            for (int i = 0; i < arrayInt.length; i++){
                if (arrayInt[i] == numParaBorrar){
                    arrayInt[i] = 0;

                    }
                }
            return arrayInt;
            }
            else {
                for (int i = 0; i < arrayInt.length; i++){
                    if (arrayInt[i] == numParaBorrar) {
                        int pos = arrayInt[i];
                        int[] arrayPostEliminacion = new int[arrayInt.length - 1];
                        int posicionesQueQuedanPorCopiar = arrayInt.length - (pos + 1);
                        System.arraycopy(arrayInt, 0, arrayPostEliminacion, 0, pos);
                        System.arraycopy(arrayInt, pos + 1, arrayPostEliminacion, pos, posicionesQueQuedanPorCopiar);
                        return arrayPostEliminacion;
                    }
                }
            }
            return arrayInt;
        }



    //TODO 3.- Un método que reciba un array de enteros como parámetro de entrada y salida, de modo que intercambie todas
    // las posiciones pares por las impares.

    static int[] cambiarParAImpar(int[] arrayQueVaACambiar){
        for(int i = 0; i<arrayQueVaACambiar.length; i++){

            if(i%2 == 0 && i+1 < arrayQueVaACambiar.length){
                int posicionAIntercambiar = arrayQueVaACambiar[i];
                arrayQueVaACambiar[i] = arrayQueVaACambiar[i+1];
                arrayQueVaACambiar[i+1] = posicionAIntercambiar;
            }

        }
        return arrayQueVaACambiar;
    }
}


