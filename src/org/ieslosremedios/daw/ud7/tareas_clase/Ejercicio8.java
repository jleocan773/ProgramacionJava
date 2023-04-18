package org.ieslosremedios.daw.ud7.tareas_clase;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        File fichero = new File("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\ficheroparaej8.txt");
        try{
            FileWriter fw = new FileWriter(fichero, true);
            fw.write("Este texto tiene que haber aparecido debajo del otro\n");
            fw.close();

            FileReader fr = new FileReader(fichero);
            int i;
            while ((i = fr.read()) != -1){
                System.out.print((char) i);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
