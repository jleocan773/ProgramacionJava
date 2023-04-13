package org.ieslosremedios.daw.ud7.ejemplos;

import org.ieslosremedios.daw.examen_tema5.Ejercicio2.Fichero;

import java.io.*;

public class EjemploFileYOperaciones {
    public static void main(String[] args) {
        //Crea una carpeta
        File miCarpeta = new File("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\CarpetaEjemploFile");
        miCarpeta.mkdir();


        //Crear un fichero
        File miFichero = new File("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\ArchivoEjemploFile.txt");
        try {
            miFichero.createNewFile();


//        //Eliminamos el fichero
//        miFichero.delete();
//
//        //Para borrar una carpeta hay que borrar primero los archivos en esta, igual que en Linux
//        miCarpeta.delete();

//            //Abrir un Fichero en modo texto, escribir y sobreescribir, importante siempre cerrar el flujo
//            FileWriter fw = new FileWriter(miFichero);
//            fw.close();

            //Abrir un Fichero en modo texto, escribir y añadirlo al final (para ello ponemos true)
            FileWriter fw = new FileWriter(miFichero, true);
            fw.write(" Guau");
            fw.close();

            //Abrir un Fichero en modo binario, escribir y añadirlo al final
            FileOutputStream fos = new FileOutputStream(miFichero, true);
            fos.write(" Kikiriki".getBytes());
            fos.close();

            //Abrir un Fichero en modo texto y leer
            FileReader fr = new FileReader(miFichero);
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char) i);
            }

            //Abrir un Fichero en modo binario y leer
            FileInputStream fis = new FileInputStream(miFichero);
            System.out.println("\n" +new String (fis.readAllBytes()));


        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
