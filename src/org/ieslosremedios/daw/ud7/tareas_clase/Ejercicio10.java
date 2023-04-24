package org.ieslosremedios.daw.ud7.tareas_clase;

import java.io.*;

public class Ejercicio10 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Ej10Per personaMisteriosa = new Ej10Per();

        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\personaMisteriosa.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(personaMisteriosa);
        oos.close();

        //Para probar que funciona
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\personaMisteriosa.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Persona de un compañero
        //FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\personadelcompañero.bin");
        //ObjectInputStream ois = new ObjectInputStream(fis);

        Ej10Per quienEsLaPersona = (Ej10Per) ois.readObject();

        System.out.println("Nombre: " + quienEsLaPersona.nombre);
        System.out.println("Apellido: " + quienEsLaPersona.apellido);
        System.out.println("Secreto: " + quienEsLaPersona.secreto);

    }
}
