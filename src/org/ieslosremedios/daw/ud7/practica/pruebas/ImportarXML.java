package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.w3c.dom.Document;
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

public class ImportarXML {

    public static void importarXML(String rutaLectura, String rutaEscritura) throws IOException, SAXException, ParserConfigurationException, TransformerException {        // Cargamos fichero que vamos a leer
        //Cargamos fichero que vamos a leer
        File file = new File(rutaLectura);

        //Parseamos el fichero al Document
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);

        //Clases necesarias para la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(rutaEscritura));

        //Transformación, de Document a Fichero.
        transformer.transform(source, result);

    }
}

