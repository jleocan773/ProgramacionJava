package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ExportarXML.exportarXML;
import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_A_Lista.pasarXMLaLista;

public class ResetearParticipaciones {
    public static void resetearParticipaciones(String rutaParaResetear) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        List<Estudiante> listaEstudiantes = pasarXMLaLista(rutaParaResetear);
        for (int i = 0; i < listaEstudiantes.size(); i++){
            listaEstudiantes.get(i).setParticipacion(0);
        }
        exportarXML(listaEstudiantes,rutaParaResetear);
        System.out.println("Se han reseteado las participaciones de los Alumnos");
    }
}
