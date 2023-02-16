package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.recorrer;

import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String[][] matrizletras = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};


        //Para un array de una sola dimensión

//        for (int i = 0; i < matrizletras.length; i++){
//            System.out.println(Arrays.toString(matrizletras[i]));
//        }

//        Para un array bidimensional con bucle For

        for (int i = 0; i < matrizletras.length; i++){
            for (int j = 0; j < matrizletras[i].length; j++){
                System.out.printf(matrizletras[i][j]);
            }
        }

        //Para un array bidimensional con bucle While

//        int i = 0;
//
//        while (i < matrizletras.length){
//            int j = 0;
//            while (j < matrizletras[i].length){
//                System.out.printf(matrizletras[i][j]);
//                j++;
//            }
//            i++;
//        }



    }
}
