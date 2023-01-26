package org.ieslosremedios.daw.ud4.ejercicios.actividad4_3;
import java.util.Arrays; //Importo "Arrays" para poder hacer operacioens con los arrays
import java.util.Random; //Importo "Random" para poder crear números aleatorios

public class Main {
    public static void main(String[] args) {

        int[] unArrayParaComparar = {1, 2, 3, 4, 5}; //Creo un array que utilizaré más tarde en el apartado 5
        int[] otroArrayParaComparar = {1, 2, 3, 4, 5}; //Creo un array que utilizaré más tarde en el apartado 5

        //TODO 1.- Crea un array con 10 números aleatorios
        int[] arrayAleatorio = crearArrayAleatorio(4); //Creo un array de tipo int que tendrá el valor de la salida del método "crearArrayAleatorio"
        System.out.println(Arrays.toString(arrayAleatorio)); //Lo muestro por pantalla

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
        System.out.println(buscarEnArray(arrayAleatorio, 50)); //Usamos el método creado
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

        int[][] arrayClon = new int[4][0];
        System.out.println("6.- Realiza 4 copias del array en un nuevo array de 4 posiciones\n");

        System.out.println("1º Una copia será utilizando el clone:");
        metodoClone(arrayClon, arrayAleatorio);


        System.out.println("2º La siguiente usando Arrays.copyOf:");
        metodoCloneOf(arrayClon, arrayAleatorio);

        System.out.println("3º La tercera usando Arrays.copyOfRange");
        metodoCloneOfRange(arrayClon, arrayAleatorio);

        System.out.println("4º La última usando System.arraycopy");
        metodoSystemClone(arrayClon, arrayAleatorio);

        System.out.println("Mostrando el arrayClon al completo: ");
        mostrarArrayClon(arrayClon);
    }

    //TODO 1.- Método para Crear Array con números aleatorios

    private static int[] crearArrayAleatorio(int longitudArray) {
        Random numaleatorio = new Random();
        int[] a = new int[longitudArray];
        for (int i = 0; i < a.length; i++) {
            a[i] = numaleatorio.nextInt(100);
        }

        return a;

    }

    //TODO 2.- Método ordenar invertido

    private static int invertirArray(int[] a) {
        for (int i = a.length - 1; i > 0; i--) { //Mientras que "i" sea menor que la longitud del array-1 (uno), se hará lo del bucle y se le
            // restará 1 (uno) a "i", así empezará por la última posición hasta llegar a la primera, la 0 (cero)
            System.out.print(a[i] + " ");         //Mostramos la posición pertinente

        }
        return a.length;

    }

    //TODO 3.- Método Ordenar
    private static String ordenarArray(int[] a) {
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
    private static String busquedaBinaria(int[] a, int x) {
        return "Búsqueda de binarySearch: El número que buscas está en la posición -> " + Arrays.binarySearch(a, x);
    }

    //TODO 5.- Compara dos arrays recibidos por parámetros devolviendo si son iguales o no
    private static void compararArrays(int[] a, int[] b) {
        System.out.println(Arrays.equals(a, b)); //Este equals es de Arrays
        System.out.println(a.equals(b)); //Este equals es de Object
    }

    //TODO 6.- Realiza 4 copias del array en un nuevo array de 4 posiciones.
    //    1º Una copia será utilizando el clone
    //    2º La siguiente usando Arrays.copyOf
    //    3º La tercera usando Arrays.copyOfRange
    //    4º La última usando System.arraycopy

    //Método con Clone

    private static void metodoClone(int[][] arrayQueRecibeCopia, int[] arrayQueSeCopia) {
        arrayQueRecibeCopia[0] = arrayQueSeCopia.clone();
        System.out.println(Arrays.toString(arrayQueRecibeCopia[0]) + "\n");
    }

    private static void metodoCloneOf(int[][] arrayQueRecibeCopia, int[] arrayQueSeCopia) {
        arrayQueRecibeCopia[1] = Arrays.copyOf(arrayQueSeCopia, 4);
        System.out.println(Arrays.toString(arrayQueRecibeCopia[1]) + "\n");
    }

    private static void metodoCloneOfRange(int[][] arrayQueRecibeCopia, int[] arrayQueSeCopia) {
        arrayQueRecibeCopia[2] = Arrays.copyOfRange(arrayQueSeCopia, 0, 4);
        System.out.println(Arrays.toString(arrayQueRecibeCopia[2]) + "\n");
    }

    private static void metodoSystemClone(int[][] arrayQueRecibeCopia, int[] arrayQueSeCopia) {
        int[] arraySystemCopy = new int[4];
        System.arraycopy(arrayQueSeCopia, 0, arraySystemCopy, 0, arrayQueSeCopia.length);
        arrayQueRecibeCopia[3] = arraySystemCopy;
        System.out.println(Arrays.toString(arrayQueRecibeCopia[3]));
    }

    private static void mostrarArrayClon(int[][] arrayClon){
        System.out.println(Arrays.toString(arrayClon[0]) + " " + (Arrays.toString(arrayClon[1]) + " " + (Arrays.toString(arrayClon[2]) + " " + (Arrays.toString(arrayClon[3])))));
    }
}
