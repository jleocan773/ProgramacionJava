package org.ieslosremedios.daw.ud7.ejercicios.actividad_7_3;

import org.ieslosremedios.daw.aaa_clases_universales.Direccion;
import org.ieslosremedios.daw.aaa_clases_universales.Persona;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Persona padrePersonaMisteriosa = new Persona("Padre de John Wick");
        Direccion direccionPersonaMisteriosa = new Direccion("Calle Falsa 123");
        Persona personaMisteriosa = new Persona("John", "Wick", 59, padrePersonaMisteriosa, direccionPersonaMisteriosa);

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

        Persona quienEsLaPersona = (Persona) ois.readObject();

        System.out.println("Nombre: " + quienEsLaPersona.nombre);
        System.out.println("Apellido: " + quienEsLaPersona.apellidos);
        System.out.println("Edad: " + quienEsLaPersona.edad);
        System.out.println("Padre: " + quienEsLaPersona.padre);
        System.out.println("Dirección: " + quienEsLaPersona.direccion);
    }
}
