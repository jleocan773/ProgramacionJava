package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> estudiantes
        Element estudiante1 = document.createElement("estudiante");
        estudiantes.appendChild(estudiante1);

        Element nombreEstudiante1 = document.createElement("nombre");
        estudiante1.appendChild(nombreEstudiante1);
        Element apellidosEstudiante1 = document.createElement("participación");
        estudiante1.appendChild(apellidosEstudiante1);

        Text textNombreEstudiante1 = document.createTextNode(listaEstudiantes.get(0).getNombre());
        nombreEstudiante1.appendChild(textNombreEstudiante1);
        Text textParticipacionEstudiante1 = document.createTextNode(String.valueOf(listaEstudiantes.get(0).getParticipacion()));
        apellidosEstudiante1.appendChild(textParticipacionEstudiante1);

        // Creamos el segundo nodo y lo colgamos de su padre, el nodo raíz. --> estudiantes
        Element estudiante2 = document.createElement("estudiante");
        estudiantes.appendChild(estudiante2);

        Element nombreEstudiante2 = document.createElement("nombre");
        estudiante2.appendChild(nombreEstudiante2);
        Element apellidosEstudiante2 = document.createElement("participación");
        estudiante2.appendChild(apellidosEstudiante2);

        Text textNombreEstudiante2 = document.createTextNode(listaEstudiantes.get(1).getNombre());
        nombreEstudiante2.appendChild(textNombreEstudiante2);
        Text textParticipacionEstudiante2 = document.createTextNode(String.valueOf(listaEstudiantes.get(1).getParticipacion()));
        apellidosEstudiante2.appendChild(textParticipacionEstudiante2);

        // Creamos el tercer nodo y lo colgamos de su padre, el nodo raíz. --> estudiantes
        Element estudiante3 = document.createElement("estudiante");
        estudiantes.appendChild(estudiante3);

        Element nombreEstudiante3 = document.createElement("nombre");
        estudiante3.appendChild(nombreEstudiante3);
        Element apellidosEstudiante3 = document.createElement("participación");
        estudiante3.appendChild(apellidosEstudiante3);

        Text textNombreEstudiante3 = document.createTextNode(listaEstudiantes.get(2).getNombre());
        nombreEstudiante3.appendChild(textNombreEstudiante3);
        Text textParticipacionEstudiante3 = document.createTextNode(String.valueOf(listaEstudiantes.get(2).getParticipacion()));
        apellidosEstudiante3.appendChild(textParticipacionEstudiante3);


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

    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes, String rutaParaEscribirFichero) throws IOException {
        Random random = new Random();
        int elegido = random.nextInt(estudiantes.size());

        if (estudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(estudiantes.size());
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + estudiantes.get(elegido) + "ahora su participación es " + estudiantes.get(elegido).getParticipacion());
            FileWriter fw = new FileWriter(rutaParaEscribirFichero);
            fw.write(estudiantes.toString());
            fw.close();
            return estudiantes.get(elegido);
        }
        else
            estudiantes.get(elegido).setParticipacion(estudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + estudiantes.get(elegido).nombre + " ahora su participación es " + estudiantes.get(elegido).getParticipacion());
            FileWriter fw = new FileWriter(rutaParaEscribirFichero);
            fw.write(estudiantes.toString());
            fw.close();
            return (estudiantes.get(elegido));
    }

}
