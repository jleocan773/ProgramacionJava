package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pruebas {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Estudiante Pablo = new Estudiante("Pablo Mateos Palas", 0),
                JuanMaria = new Estudiante("Juan María Mateos Ponce", 0),
                Victor = new Estudiante("Victor Chacón Calle", 0),
                Jose = new Estudiante("José Ramirez Sanchez", 0),
                Jorge = new Estudiante("Jorge Coronil Villalba", 0),
                Ricardo = new Estudiante("Ricardo Gabriel Moreno Cantea", 0),
                Adrian = new Estudiante("Adrián Merino Gamaza", 0),
                JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Diego = new Estudiante("Diego González Romero", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0),
                JuanManuelS = new Estudiante("Juan Manuel Saborido Baena", 0),
                Julian = new Estudiante("Julian García Velázquez", 0),
                JoseAntonio = new Estudiante("Jose Antonio Jaén Gómez", 0),
                AntonioJesus = new Estudiante("Antonio Jesús Téllez Perdigones", 0);

        final String ruta = "src/org/ieslosremedios/daw/ud7/practica/pruebas/pruebas.txt";
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);
        seleccionarAleatorio(listaEstudiantes, ruta);

    }

    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String rutaParaEscribirFichero) throws IOException, ClassNotFoundException {
        estudiantes.clear();
        estudiantes = leerFicheroEstudiantes(rutaParaEscribirFichero);
        Random random = new Random();
        int elegido = random.nextInt(estudiantes.size());

        if (estudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(estudiantes.size());
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + estudiantes.get(elegido).getNombre() + "ahora su participación es " + estudiantes.get(elegido).getParticipacion());
            FileWriter fw = new FileWriter(rutaParaEscribirFichero);
            fw.write(estudiantes.toString());
            fw.close();
            return estudiantes.get(elegido);
        }
        else
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
        System.out.println("Se ha elegido a " + estudiantes.get(elegido).getNombre() + " ahora su participación es " + estudiantes.get(elegido).getParticipacion());
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