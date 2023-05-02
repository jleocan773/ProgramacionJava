package org.ieslosremedios.daw.ud7.practica.pruebas.paraentregar;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OperacionesApp {


    public static void exportarXML(List<Estudiante> listaEstudiantes, String rutaParaExportar) throws ParserConfigurationException, TransformerException {
        // Creamos el documento vacío para añadirle a continuación los nodos
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element estudiantes = document.createElement("estudiantes");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(estudiantes);

        //Hacemos un bucle para añadir todos los elementos de la lista al XML
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

        }

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File(rutaParaExportar));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);

    }

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

    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String rutaParaEscribirFichero) throws  ParserConfigurationException, TransformerException, JAXBException {
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

    public static List<Estudiante> leerFicheroEstudiantes(String ruta) throws IOException, ClassNotFoundException {
        FileInputStream readData = new FileInputStream(ruta);
        ObjectInputStream readStream = new ObjectInputStream(readData);

        ArrayList<Estudiante> estudiantes = (ArrayList<Estudiante>) readStream.readObject();
        readStream.close();
        return estudiantes;
    }
}
