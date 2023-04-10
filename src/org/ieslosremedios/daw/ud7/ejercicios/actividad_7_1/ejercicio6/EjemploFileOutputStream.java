package org.ieslosremedios.daw.ud7.ejercicios.actividad_7_1.ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFileOutputStream {
    public static void main(String[] args) throws IOException {
        //Se crea el Stream y se iguala a nulo para que sea visible en el código al completo
        FileOutputStream salidafichero = null;
        //Se crea el fichero
        File fichero;
        //Se le asigna la ruta a este fichero
        fichero = new File("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\EjemploFileOutputStream.txt");
        try {
            //Se asigna al Stream la ruta del fichero sobre el que queremos escribir
            salidafichero = new FileOutputStream(fichero);
            //Escribimos en el fichero con el método "write" de FileOutputStream
            //Como en el write debemos de usar Bytes en lugar de un String, usamos el método "getBytes" de String
            salidafichero.write("1 ".getBytes());
            salidafichero.write("2 ".getBytes());
            salidafichero.write("3 ".getBytes());
            //Mostramos un mensaje que indica que el proceso ha sido exitoso
            System.out.println("Se ha escrito correctamente en el fichero");
        }   //Creamos una excepción para el caso de que no se encuentre un fichero en la ruta indicada
        catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            e.printStackTrace();
        }   //Creamos una excepción para el caso de que falle la entrada / salida
        catch (IOException e) {
            System.out.println("Introduce una cadena de caracteres");
            e.printStackTrace();
        }
        finally {
            //Si hemos modificado la variable salidafichero, es decir, si salidafichero no es nulo:
            if (salidafichero != null) {
                //Cerramos el Stream, de no cerrarlo podría ocupar espacio en memoria porque podría seguir aceptando escritura
                salidafichero.close();
                System.out.println("Programa terminado");
            }
        }
    }
}
