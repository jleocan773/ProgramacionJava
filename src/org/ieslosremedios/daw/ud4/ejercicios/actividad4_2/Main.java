package org.ieslosremedios.daw.ud4.ejercicios.actividad4_2;

public class Main {
    public static void main(String[] args) {

        int[][] tabla = new int[10][3]; //Creamos un array de tipo entero de diez posiciones

        for (int i = 1; i <= tabla.length; i++) {
            for (int j = 1; j <= tabla.length; j++) {
                tabla[i][0] = i;
                tabla[i][1] = j;
                tabla[i][2] = (i * j);

                System.out.println(tabla[i][0] + " * " + tabla[i][1] + " = " + tabla[i][2]);
            }
        }
    }


}