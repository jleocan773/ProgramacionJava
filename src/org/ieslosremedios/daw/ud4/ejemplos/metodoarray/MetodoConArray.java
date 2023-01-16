package org.ieslosremedios.daw.ud4.ejemplos.metodoarray;

public class MetodoConArray {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        String z = "Hola Buenas Tardes";
        Double[] arrayDeEntrada = {1d,2d,3d};
        // Imprimimos todos los valores antes de ejecutar el método
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(arrayDeEntrada[0]);
        System.out.println(arrayDeEntrada[1]);
        System.out.println(arrayDeEntrada[2]);
        int[][] datosRetorno = metodo(x,y,z,arrayDeEntrada);
        //Imprimimos los valores después de ejecutar el método
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(arrayDeEntrada[0]);
        System.out.println(arrayDeEntrada[1]);
        System.out.println(arrayDeEntrada[2]);
        //Vemos que el valor del array sí que cambiaría
    }
    static int[][] metodo(int x, int y, String z, Double[] arrayDeEntrada){
        x = 50;
        z = "Guau guau guau";
        arrayDeEntrada[0] = 4d;
        arrayDeEntrada[1] = 5d;
        arrayDeEntrada[2] = 6d;
        return new int[2][2];
    }
}
