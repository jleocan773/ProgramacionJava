package org.ieslosremedios.daw.ud7.practica.pruebas.paraentregar;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.*;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ExportarXML.exportarXML;
import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_A_Lista.pasarXMLaLista;

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
    
    public static Estudiante seleccionarAleatorio(List<Estudiante> listaEstudiantes, String rutaParaEscribirFichero) throws ParserConfigurationException, TransformerException, JAXBException, IOException, SAXException {
        listaEstudiantes = pasarXMLaLista(rutaParaEscribirFichero);
        Random random = new Random();
        int elegido = random.nextInt(listaEstudiantes.size());

        if (listaEstudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(listaEstudiantes.size());
            listaEstudiantes.get(elegido).setParticipacion(listaEstudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + listaEstudiantes.get(elegido).getNombre() + " ahora su participación es " + listaEstudiantes.get(elegido).getParticipacion());
            exportarXML(listaEstudiantes, rutaParaEscribirFichero);
            return listaEstudiantes.get(elegido);
        }
        else
            listaEstudiantes.get(elegido).setParticipacion(listaEstudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + listaEstudiantes.get(elegido).getNombre() + " ahora su participación es " + listaEstudiantes.get(elegido).getParticipacion());
            exportarXML(listaEstudiantes, rutaParaEscribirFichero);
        return (listaEstudiantes.get(elegido));
    }

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

                    listaestudiantes.add(estudiante);
                }
            }
            return listaestudiantes;
        }
    }

    public static void resetearParticipaciones(String rutaParaResetear) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        List<Estudiante> listaEstudiantes = pasarXMLaLista(rutaParaResetear);
        for (int i = 0; i < listaEstudiantes.size(); i++){
            listaEstudiantes.get(i).setParticipacion(0);
        }
        exportarXML(listaEstudiantes,rutaParaResetear);
        System.out.println("Se han reseteado las participaciones de los Alumnos");
    }


}
