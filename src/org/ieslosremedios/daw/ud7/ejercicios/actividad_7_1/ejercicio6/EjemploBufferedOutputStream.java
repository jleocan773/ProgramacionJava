package org.ieslosremedios.daw.ud7.ejercicios.actividad_7_1.ejercicio6;

import java.io.*;

public class EjemploBufferedOutputStream {
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\EjemploBufferedOutputStream.txt");
        try {
            FileOutputStream fos = new FileOutputStream(fichero);
            BufferedOutputStream bufer = new BufferedOutputStream(fos);
            bufer.write("H".getBytes());
            bufer.write("o".getBytes());
            bufer.write("l".getBytes());
            bufer.write("a".getBytes());
            bufer.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
