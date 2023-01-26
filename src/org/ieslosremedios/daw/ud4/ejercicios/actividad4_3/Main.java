package org.ieslosremedios.daw.ud4.ejercicios.actividad4_3;
import java.util.Arrays; //Importo "Arrays" para poder hacer operacioens con los arrays
import java.util.Random; //Importo "Random" para poder crear números aleatorios

public class Main {
    public static void main(String[] args) {

        //TODO 1.- Crea un array con 10 números aleatorios
        Random numaleatorio = new Random(); //Creo una variable "numaleatorio" de tipo Random con su constructor
        int[] arrayAleatorio = new int[10]; //Creo "arrayAleatorio" de tipo int que tendrá 10 posiciones, pero no le asigno contenido
        int[] unArrayParaComparar = {1,2,3,4,5}; //Creo un array que utilizaré más tarde en el apartado 5
        int[] otroArrayParaComparar = {1,2,3,4,5}; //Creo un array que utilizaré más tarde en el apartado 5
        int[] yEsteOtroArrayParaClonar = {5,10,15,20,25,30}; //Creo un array que utilizaré mñas tarde en el apartado 6


        for (int i = 0; i < arrayAleatorio.length; i++) { //El contenido se lo asignará con un bucle for
            arrayAleatorio[i] = numaleatorio.nextInt(100); //Usando el método "nextInt()", que crea un número aleatorio, asigno a todas las posiciones de "arrayAleatorio"
        }
        System.out.println("---------------------------------------------------------");


        //TODO 2.- Imprime el array anterior empezando por la última posición
        System.out.println("2.- Imprime el array anterior empezando por la última posición");
        System.out.println(invertirArray(arrayAleatorio));

        System.out.println("\n---------------------------------------------------------");

        //TODO 3.- Ordena el array utilizando la clase de utilidades Arrays
        System.out.println("3.- Ordena el array utilizando la clase de utilidades Arrays");
        System.out.println(ordenarArray(arrayAleatorio));

        System.out.println("---------------------------------------------------------");

        //TODO 4.- Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes, primero el manual y luego el binarySearch
        System.out.println("4.- Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes, primero el manual y luego el binarySearch");
        System.out.println(buscarEnArray(arrayAleatorio,50)); //Usamos el método creado
        System.out.println(busquedaBinaria(arrayAleatorio, 50)); //Usamos el método que usa BinarySearch

        System.out.println("---------------------------------------------------------");

        //TODO 5.- Compara dos arrays recibidos por parámetros devolviendo si son iguales o no
        //Voy a comparar los arrays con el método "equals" de la clase "Arrays", que compara el contenido de los arrays
        System.out.println("5.- Compara dos arrays recibidos por parámetros devolviendo si son iguales o no");
        compararArrays(unArrayParaComparar, otroArrayParaComparar);

        System.out.println("---------------------------------------------------------");

        //TODO 6.- Realiza 4 copias del array en un nuevo array de 4 posiciones.
        //    1º Una copia será utilizando el clone
        //    2º La siguiente usando Arrays.copyOf
        //    3º La tercera usando Arrays.copyOfRange
        //    4º La última usando System.arraycopy

        int[][] clonArray = new int[4][1];
        System.out.println("6.- Realiza 4 copias del array en un nuevo array de 4 posiciones");
        clonArray[0] = yEsteOtroArrayParaClonar.clone();
        clonArray[1] = Arrays.copyOf(yEsteOtroArrayParaClonar, 4);
        clonArray[2] =  Arrays.copyOfRange(yEsteOtroArrayParaClonar, 4, yEsteOtroArrayParaClonar.length + 3);
        //clonArray[3] = System.arraycopy(yEsteOtroArrayParaClonar,4,clonArray,4,4);

        System.out.println(Arrays.toString(clonArray));
    }

    //TODO 1.- Método para Crear Array con números aleatorios

    //TODO 2.- Método ordenar invertido

    private static int invertirArray(int[] a) {
        for (int i = a.length - 1; i > 0; i--) { //Mientras que "i" sea menor que la longitud del array-1 (uno), se hará lo del bucle y se le
                                                  // restará 1 (uno) a "i", así empezará por la última posición hasta llegar a la primera, la 0 (cero)
            System.out.print(a[i] + " ");         //Mostramos la posición pertinente

        } return a.length;

    }

    //TODO 3.- Método Ordenar
    private static String ordenarArray(int[] a)
    {
        Arrays.sort(a); //Usando el método "sort" ordenamos arrayAleatorio
        return Arrays.toString(a);
    }

    //TODO 4.- Método manual
    private static String buscarEnArray(int[] a, int x) { //Declaramos el método "buscarEnArray", que aceptará dos parámetros, el array en el que queremos buscar
                                                       //y el número que queremos buscar
        for (int i = 0; i < a.length; i++) {           //Hacemos que "i" valga cero y que el bucle se ejecute mientras que "i" sea menor que la longitud del array,
                                                       // reduciendo el valor de i en 1 (uno) en cada iteración
            if (x == a[i]) {                           // En el caso de que el número introducido sea igual al valor de la posición [i]
                return "Búsqueda Manual: El número que buscas está en la posición -> " + i;
            }                                          //Se devuelve el valor de "i"
        }
        return "No se ha encontrado el número";        //Si no se encuentra, devolverá este mensaje
    }

    //TODO 4.- Método Búsqueda Binaria
    private static String busquedaBinaria(int[]a, int x){
        return "Búsqueda de binarySearch: El número que buscas está en la posición -> " + Arrays.binarySearch(a,x);
    }

    //TODO 5.- Compara dos arrays recibidos por parámetros devolviendo si son iguales o no
    private static void compararArrays(int[] a, int[] b) {
        System.out.println(Arrays.equals(a, b)); //Este equals es de Arrays
        System.out.println(a.equals(b)); //Este equals es de Object
    }
}
