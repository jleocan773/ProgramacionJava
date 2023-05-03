package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ExportarXML.exportarXML;

public class SeleccionarAleatorio {
    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String rutaParaEscribirFichero) throws ParserConfigurationException, TransformerException, JAXBException {


        Random random = new Random();
        int elegido = random.nextInt(estudiantes.size());

        if (estudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(estudiantes.size());
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + estudiantes.get(elegido).getNombre() + "ahora su participación es " + estudiantes.get(elegido).getParticipacion());
            exportarXML(estudiantes, rutaParaEscribirFichero);
            return estudiantes.get(elegido);
        }
        else
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
        System.out.println("Se ha elegido a " + estudiantes.get(elegido).getNombre() + " ahora su participación es " + estudiantes.get(elegido).getParticipacion());
        exportarXML(estudiantes, rutaParaEscribirFichero);
        return (estudiantes.get(elegido));
    }
}
