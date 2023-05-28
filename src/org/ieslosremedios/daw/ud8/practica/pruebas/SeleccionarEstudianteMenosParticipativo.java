package org.ieslosremedios.daw.ud8.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ExportarXML.exportarXML;
import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_A_Lista.pasarXMLaLista;

public class SeleccionarEstudianteMenosParticipativo {
    public static Estudiante seleccionarAlumnoMenosParticipativo(String rutaXML) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        List<Estudiante> listaEstudiantes = pasarXMLaLista(rutaXML);
        Estudiante estudianteMenosParticipativo = listaEstudiantes.get(0);
        for (int i = 1; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getParticipacion() < estudianteMenosParticipativo.getParticipacion()) {
                estudianteMenosParticipativo = listaEstudiantes.get(i);
            }
        }
        estudianteMenosParticipativo.setParticipacion(estudianteMenosParticipativo.getParticipacion() + 1);
        exportarXML(listaEstudiantes, rutaXML);
        return estudianteMenosParticipativo;
    }
}

