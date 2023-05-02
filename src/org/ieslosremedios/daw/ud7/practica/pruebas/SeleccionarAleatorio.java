package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeleccionarAleatorio {
    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String rutaParaEscribirFichero) throws IOException, ClassNotFoundException {
        estudiantes.clear();
        estudiantes = leerFicheroEstudiantes(rutaParaEscribirFichero);
        Random random = new Random();
        int elegido = random.nextInt(estudiantes.size());

        if (estudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(estudiantes.size());
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + estudiantes.get(elegido) + "ahora su participación es " + estudiantes.get(elegido).getParticipacion());
            FileWriter fw = new FileWriter(rutaParaEscribirFichero);
            fw.write(estudiantes.toString());
            fw.close();
            return estudiantes.get(elegido);
        }
        else
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
        System.out.println("Se ha elegido a " + estudiantes.get(elegido).nombre + " ahora su participación es " + estudiantes.get(elegido).getParticipacion());
        FileWriter fw = new FileWriter(rutaParaEscribirFichero);
        fw.write(estudiantes.toString());
        fw.close();
        return (estudiantes.get(elegido));
    }

    public static List<Estudiante> leerFicheroEstudiantes(String ruta) throws IOException, ClassNotFoundException {
        FileInputStream readData = new FileInputStream(ruta);
        ObjectInputStream readStream = new ObjectInputStream(readData);

        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) readStream.readObject();
        readStream.close();
        return estudiantes;
    }
}
