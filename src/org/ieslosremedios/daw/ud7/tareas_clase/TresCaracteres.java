package org.ieslosremedios.daw.ud7.tareas_clase;

import java.io.IOException;

public class TresCaracteres {
    public static void main(String[] args) throws IOException {

        //Pedir al usuario que introduzca tres caracteres por teclado
        //Imprimirlos concatenados
        //1.- Usando el write
        //2.- Usando el print
        //3.- Usando el println

//        USANDO EL WRITE
        int primerCaracter = System.in.read();
        int segundoCaracter = System.in.read();
        int tercerCaracter = System.in.read();

        System.out.write(primerCaracter);
        System.out.write(segundoCaracter);
        System.out.write(tercerCaracter);
        System.out.println();


//        USANDO EL PRINT
        System.out.print("" + (char)primerCaracter + (char)segundoCaracter + (char)tercerCaracter);
//        USANDO EL PRINTLN
        System.out.println("\n" + (char)primerCaracter + (char)segundoCaracter + (char)tercerCaracter);



    }
}
