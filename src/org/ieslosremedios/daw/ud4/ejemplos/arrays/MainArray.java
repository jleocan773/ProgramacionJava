package org.ieslosremedios.daw.ud4.ejemplos.arrays;

public class MainArray {
    public static void main(String[] args) {
         Integer[] arrayInteger = {2,3,5,7,11};

          System.out.println(arrayInteger[0]);
          System.out.println(arrayInteger[1]);
          System.out.println(arrayInteger[2]);
          System.out.println(arrayInteger[3]);
          System.out.println(arrayInteger[4]);
          System.out.println("El arrayInteger tiene " + arrayInteger.length + " posiciones");

          System.out.println("\nArray Bidimensional: ");
        int[][] arrayBidimensional = {{0,0},{0,1},{0,2},{0,3},{0,4}};

           System.out.println(arrayBidimensional[0][0]);
           System.out.println(arrayBidimensional[0][1]);
           System.out.println(arrayBidimensional[1][0]);
           System.out.println(arrayBidimensional[1][1]);
           System.out.println(arrayBidimensional[2][0]);
           System.out.println(arrayBidimensional[2][1]);
           System.out.println(arrayBidimensional[3][0]);
           System.out.println(arrayBidimensional[3][1]);
           System.out.println(arrayBidimensional[4][0]);
           System.out.println(arrayBidimensional[4][1]);
           System.out.println("Largura del arrayBidimensional: ");
           System.out.println(arrayBidimensional.length);
           System.out.println("Largura de la posición 0 del arrayBidimensional: ");
           System.out.println(arrayBidimensional[0].length);

           System.out.println("\nArray Tridimensional: ");

        int[][] array3Bidimensional = {{0,0,0},{0,1,2},{0,2,4},{0,3,6},{0,4,8}};
           System.out.println(array3Bidimensional[0][0]);
           System.out.println(array3Bidimensional[0][1]);
           System.out.println(array3Bidimensional[0][2]);
           System.out.println(array3Bidimensional[1][0]);
           System.out.println(array3Bidimensional[1][1]);
           System.out.println(array3Bidimensional[1][2]);
           System.out.println(array3Bidimensional[2][0]);
           System.out.println(array3Bidimensional[2][1]);
           System.out.println(array3Bidimensional[2][2]);
           System.out.println(array3Bidimensional[3][0]);
           System.out.println(array3Bidimensional[3][1]);
           System.out.println(array3Bidimensional[3][2]);
           System.out.println(array3Bidimensional[4][0]);
           System.out.println(array3Bidimensional[4][1]);
           System.out.println(array3Bidimensional[4][2]);
           System.out.println("Largura del array3Bidimensional: ");
           System.out.println(array3Bidimensional.length);
           System.out.println("Largura de la posición 0 del array3Bidimensional: ");
           System.out.println(array3Bidimensional[0].length);


        int [][] enteros = new int[3][];

        enteros[0] = new int[1];
        enteros[0][0] = 0;
        enteros[1] = new int[2];
        enteros[1][0] = 1;
        enteros[1][1] = 2;
        enteros[2] = new int[3];
        enteros[2][0] = 3;
        enteros[2][1] = 4;
        enteros[2][2] = 5;


    }
}
