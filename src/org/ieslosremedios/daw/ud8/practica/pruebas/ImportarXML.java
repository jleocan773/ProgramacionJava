package org.ieslosremedios.daw.ud8.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ImportarXML {

    public static void importarXML(List<Estudiante> listaEstudiantes, String rutaParaImportar){
        try {
            //Creamos el documento vacío para añadirle a continuación los nodos
            Document document = null;
            document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();
            //Creamos el nodo raíz
            Element estudiantes = document.createElement("estudiantes");
            //Hacemos que cuelgue del documento (estructura de árbol)
            document.appendChild(estudiantes);

            //Hacemos un bucle para añadir todos los elementos de la lista al XML
            for (int i = 0; i < listaEstudiantes.size(); i++) {

                //Creamos la variable estudiante, se irá creando un elemento estudiante para cada uno de los elementos de la lista
                Estudiante estudiante = listaEstudiantes.get(i);
                Element estudianteElement = document.createElement("estudiante");
                estudiantes.appendChild(estudianteElement);

                //Creamos el elemento "nombreEstudiante" y hacemos que cuelgue de estudiante
                //el valor de esta variable irá cambiando con el bucle
                Element nombreEstudiante = document.createElement("nombre");
                estudianteElement.appendChild(nombreEstudiante);
                Text textNombreEstudiante = document.createTextNode(estudiante.getNombre());
                nombreEstudiante.appendChild(textNombreEstudiante);

                //Creamos el elemento "participacionEstudiante" y hacemos que cuelgue de estudiante
                //el valor de esta variable irá cambiando con el bucle
                Element participacionEstudiante = document.createElement("participacion");
                estudianteElement.appendChild(participacionEstudiante);
                Text textParticipacionEstudiante = document.createTextNode(String.valueOf(estudiante.getParticipacion()));
                participacionEstudiante.appendChild(textParticipacionEstudiante);

            }

            //Clases necesarias para finalizar la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(rutaParaImportar));

            //Se realiza la transformación, de Document a Fichero.
            transformer.transform(source, result); }

        catch (ParserConfigurationException e) {
            System.out.println("Ha fallado el parseo " + e.getMessage());
        } catch (TransformerConfigurationException e) {
            System.out.println("Ha fallado la transformación del documento " + e.getMessage());
        } catch (TransformerException e) {
            System.out.println("Ha fallado la transformación del documento " + e.getMessage());

        }
    }
}

