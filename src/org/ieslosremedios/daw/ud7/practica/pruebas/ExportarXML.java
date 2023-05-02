package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.List;

public class ExportarXML {
    public static void exportarXML(List<Estudiante> listaEstudiantes, String rutaParaExportar) throws ParserConfigurationException, TransformerException {
        // Creamos el documento vacío para añadirle a continuación los nodos
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element estudiantes = document.createElement("estudiantes");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(estudiantes);


        for (int i = 0; i < listaEstudiantes.size(); i++) {
            Estudiante estudiante = listaEstudiantes.get(i);
            Element estudianteElement = document.createElement("estudiante");
            estudiantes.appendChild(estudianteElement);

            Element nombreEstudiante = document.createElement("nombre");
            estudianteElement.appendChild(nombreEstudiante);
            Text textNombreEstudiante = document.createTextNode(estudiante.getNombre());
            nombreEstudiante.appendChild(textNombreEstudiante);

            Element participacionEstudiante = document.createElement("participacion");
            estudianteElement.appendChild(participacionEstudiante);
            Text textParticipacionEstudiante = document.createTextNode(String.valueOf(estudiante.getParticipacion()));
            participacionEstudiante.appendChild(textParticipacionEstudiante);


            // Clases necesarias para finalizar la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(rutaParaExportar));

            // Se realiza la transformación, de Document a Fichero.
            transformer.transform(source, result);


        }
    }
}
