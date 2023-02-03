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

        int[] arrayParaInsertar = {1, 2, 3, 4};
        arrayParaInsertar = insertarNuevoElemento(arrayParaInsertar, 25, 0);
        System.out.println(Arrays.toString(arrayParaInsertar));


    }

    //TODO 1.- A continuación de la actividad A4.3. continúa creando los siguientes métodos:
    // Un método que recibe un array de enteros, un elemento entero y una posición. Devuelve otro array que será
    // una copia del array de entrada pero insertando un nuevo elemento (el indicado en los parámetros) en la
    // posición indicada. Ahora sobrecarga el método para que reciba en lugar de un elemento entero un elemento que
    // sea otro array de enteros. Habrá que insertar los elementos de este array empezando desde la posición.

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
}


