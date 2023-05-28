package org.ieslosremedios.daw.ud8.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_A_Lista.pasarXMLaLista;

public class MostrarEstudiantesMasYMenosParticipativo {
    public static void mostrarAlumnoMasYMenosParticipativo(String rutaXML) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        List<Estudiante> listaEstudiantes = pasarXMLaLista(rutaXML);
        Estudiante estudianteMenosParticipativo = listaEstudiantes.get(0);
        for (int i = 1; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getParticipacion() < estudianteMenosParticipativo.getParticipacion()) {
                estudianteMenosParticipativo = listaEstudiantes.get(i);
            }
        }
        System.out.println("El Alumno menos participativo es: " + estudianteMenosParticipativo.getNombre() + " con una participación de " + estudianteMenosParticipativo.getParticipacion());

        Estudiante estudianteMasParticipativo = listaEstudiantes.get(0);
        for (int i = 1; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getParticipacion() > estudianteMasParticipativo.getParticipacion()) {
                estudianteMasParticipativo = listaEstudiantes.get(i);
            }
        }
        System.out.println("El Alumno menos participativo es: " + estudianteMasParticipativo.getNombre() + " con una participación de " + estudianteMasParticipativo.getParticipacion());

    }
}
