package org.ieslosremedios.daw.ud4.ejercicios.actividad4_2;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][][] tablaMult = new int[10][10][3];

        for(int i = 1; i <= 10; i++) {
            tablaMult[i - 1] = multiplicarTablas(i);
        }
        mostrarTabla(tablaMult);
    }

    public static int[][] multiplicarTablas(int n) {
        int[][] tabla = new int[10][3];

        for(int i = 0; i < tabla.length; i++) {
            tabla[i][0] = n;
            tabla[i][1] = i + 1;
            tabla[i][2] = n * tabla[i][1];
        }
            return tabla;
    }

    public static void mostrarTabla (int[][][] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            System.out.print("Tabla del " + (i + 1) + ": \n" );

            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(Arrays.toString(tabla[i][j]) + " ");
            }
            System.out.println();
        }
    }
}