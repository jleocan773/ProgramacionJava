package org.ieslosremedios.daw.ud7.ejercicios.actividad_7_1.ejercicio6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploFileInputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\EjemploFileInputStream.txt");
            int leer=fis.read();
            while(leer!=-1){
                System.out.print((char)leer);
                leer=fis.read();
            }
            System.out.println();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Programa terminado");
    }
}


