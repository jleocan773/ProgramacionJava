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

public class ExportarXML {
    public static void exportarXML(String rutaLectura, String rutaEscritura) {
        try {
            //Cargamos fichero que vamos a leer
            File file = new File(rutaLectura);

            //Parseamos el fichero al Document
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);

            //Clases necesarias para la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(new File(rutaEscritura));

            //Transformación, de Document a Fichero.
            transformer.transform(source, result);

        } catch (ParserConfigurationException e) {
            System.out.println("Ha fallado el parseo " + e.getMessage());
        } catch (TransformerConfigurationException e) {
            System.out.println("Ha fallado la transformación del documento " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Ha fallado la entrada/salida " + e.getMessage());
        } catch (TransformerException e) {
            System.out.println("Ha fallado la transformación del documento " + e.getMessage());
        } catch (SAXException e) {
            System.out.println("Ha fallado el parseo a XML " + e.getMessage());
        }
    }
}
