package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class PasarXML_A_Lista {
    public static List<Estudiante> PasarXMLaLista(String rutaXML) throws ParserConfigurationException, IOException, SAXException {
        List<Estudiante> listaestudiantes = new LinkedList<>();
        File file = new File(rutaXML);
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        NodeList estudiantes = document.getElementsByTagName("estudiante");

        for (int i = 0; i < estudiantes.getLength(); i++) {
            Node node = estudiantes.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {

                Element eElement = (Element) node;
                Estudiante estudiante = new Estudiante();
                estudiante.setNombre(eElement.getElementsByTagName("nombre").item(0).getTextContent());
                estudiante.setParticipacion(Integer.parseInt(eElement.getElementsByTagName("participacion").item(0).getTextContent()));

                //Add Employee to list
                listaestudiantes.add(estudiante);
            }
        }
        return listaestudiantes;
    }
}
