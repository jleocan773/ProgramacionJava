package org.ieslosremedios.daw.ud8.practica.pruebas;
import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.List;

import static org.ieslosremedios.daw.ud8.practica.pruebas.PasarXML_A_Lista.pasarXMLaLista;


public class AlumnosPorDebajoMedia {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        mostrarAlumnosPorDebajoDeLaMedia("C:\\Users\\LionPride\\IdeaProjects\\ProgramacionJava\\src\\org\\ieslosremedios\\daw\\ud8\\practica\\pruebas\\alumnos.xml");
    }

    public static void mostrarAlumnosPorDebajoDeLaMedia(String rutaArchivoXML) throws ParserConfigurationException, IOException, SAXException {
        List<Estudiante> listaEstudiantes = pasarXMLaLista(rutaArchivoXML);
        int mediaParticipacion = 0;
        for (int i = 0; i < listaEstudiantes.size(); i++){
            mediaParticipacion += listaEstudiantes.get(i).getParticipacion();
        }
        mediaParticipacion = mediaParticipacion  / listaEstudiantes.size();
        for (int i = 0 ; i < listaEstudiantes.size(); i++){
            if ( listaEstudiantes.get(i).getParticipacion() < mediaParticipacion){
                System.out.println(listaEstudiantes.get(i));
            }
        }
    }

}
