package org.ieslosremedios.daw.ud4.ejercicios.actividad4_2;

public class Prueba {
    public static void main(String[] args) {
        int[][] tablaMult = new int[10][3];
        System.out.println(hacerTablaMult(tablaMult));
        mostrarTablaMult(tablaMult);
    }

    static int[][] hacerTablaMult(int[][] numTabla) {
        int[][] tabla = new int[10][3];

        for (int i = 1; i <= tabla.length - 1; i++) {
            int j = 1;
            for (; j <= tabla.length - 1; j++) {
                tabla[i][0] = i;
                tabla[i][1] = j;
                tabla[i][2] = (i * j);
            }
        }
        return tabla;
    }

    static void mostrarTablaMult(int[][] tablaMult) {
        for (int i = 0; i < tablaMult.length; i++){
            System.out.println((tablaMult[i][0]));
            System.out.println((tablaMult[i][1]));
            System.out.println((tablaMult[i][2]));
        }
    }
}