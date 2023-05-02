package org.ieslosremedios.daw.alumnoaleatorio;
import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import java.io.*;
import java.util.*;


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

        final String ruta = "src/org/ieslosremedios/daw/alumnoaleatorio/alumnos.txt";
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);
        //System.out.println(listaEstudiantes);

        //Opciones para el menú:
        //crearFicheroEstudiantes(listaEstudiantes, ruta);
        //System.out.println(leerFicheroEstudiantes(ruta));
        //System.out.println(seleccionarAleatorio(listaEstudiantes, ruta));
    }

    public static List<Estudiante> leerFicheroEstudiantes(String ruta) throws IOException, ClassNotFoundException {
        FileInputStream readData = new FileInputStream(ruta);
        ObjectInputStream readStream = new ObjectInputStream(readData);

        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) readStream.readObject();
        readStream.close();
        return estudiantes;
    }

    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String ruta) throws IOException, ClassNotFoundException {
        estudiantes.clear();
        estudiantes = leerFicheroEstudiantes(ruta);

        Random random = new Random();
        int elegido = random.nextInt(estudiantes.size());

        //Aquí queda por cambiar el número 50 por la mayor participación que haya en la lista
        //O sea, hay que recorrer la lista, guardar la participación del primer estudiante en una variable y compararla
        //con el resto de valores de la participación del resto de estudiantes, cambiando el valor de la variable si se
        //encuentra un valor mayor
        if (estudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(estudiantes.size());
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + estudiantes.get(elegido).getNombre() + "ahora su participación es " + estudiantes.get(elegido).getParticipacion());

            FileOutputStream writeData = new FileOutputStream(ruta);
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(estudiantes);
            writeStream.flush();
            writeStream.close();

            return estudiantes.get(elegido);
        }
        else estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
        System.out.println("Se ha elegido a " + estudiantes.get(elegido).getNombre() + " ahora su participación es " + estudiantes.get(elegido).getParticipacion());
        FileOutputStream writeData = new FileOutputStream(ruta);
        ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

        writeStream.writeObject(estudiantes);
        writeStream.flush();
        writeStream.close();

        return (estudiantes.get(elegido));
    }



}
