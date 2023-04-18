package org.ieslosremedios.daw.ud7.tareas_clase;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        try {
            //1.- Crea un nuevo fichero eliminando el que ya existía
            //2.- Abre un flujo de acceso aleatorio al fichero e introduce "defg"
            //3.- Lee el fichero
            //4.- Añade al principio la cadena "abc" y al final la cadena "hij"
            //5.- Sustitute las vocales por *

            File fichero = new File("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\ficheroparaej9.txt");
            if (!fichero.exists()){
                fichero.createNewFile();
            }
            else {
                fichero.delete();
                fichero.createNewFile();
            }

            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            raf.write("defg".getBytes());
            raf.seek(0);
            System.out.println(raf.readLine());
            raf.write("hij".getBytes());
            raf.seek(0);
            String temp = raf.readLine();
            raf.seek(0);
            raf.write("abc".getBytes());
            raf.write(temp.getBytes());
            raf.seek(0);
            System.out.println(raf.readLine());
            raf.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
