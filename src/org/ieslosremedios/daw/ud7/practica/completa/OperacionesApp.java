package org.ieslosremedios.daw.ud7.practica.completa;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_A_Lista.pasarXMLaLista;

public class OperacionesApp {

    //El método pasa a un archivo XML una Lista
    //Como parámetro recibe una lista, que convertirá en el archivo XML y una ruta, donde guardará el archivo
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


    //Este método exporta un archivo XML de una ruta indicada
    //Como parámetro acepta un String con la ruta desde dónde hará la copia y otro String con dónde escribir esa copia
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


    //Este método busca al alumno menos participativo y lo devuelve, sumándole 1 a su participación
    //Como parámetro recibe la ruta del archivo XML del que queremos sacar el estudiante menos participativo
    public static Estudiante seleccionarAlumnoMenosParticipativo(String rutaXML) {
        //Carga una lista y guarda el primer elemento de esta como el alumno menos participativo
        List<Estudiante> listaEstudiantes = null;
        listaEstudiantes = pasarXML_A_Lista(rutaXML);
        Estudiante estudianteMenosParticipativo = listaEstudiantes.get(0);
        //Recorre la lista con un bucle y va cambiando el valor de la variable "estudianteMenosParticipativo" si encuentra que
        //el siguiente alumno de la lista tiene una participación menor que el alumno que está guardado en la variable
        for (int i = 1; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getParticipacion() < estudianteMenosParticipativo.getParticipacion()) {
                estudianteMenosParticipativo = listaEstudiantes.get(i);
            }
        }
        //Aumenta la participación del alumno que se ha elegido en uno
        estudianteMenosParticipativo.setParticipacion(estudianteMenosParticipativo.getParticipacion() + 1);
        //Para guardar los cambios en el XML se importa el archivo
        importarXML(listaEstudiantes, rutaXML);
        //Devuelve el alumno menos participativo
        return estudianteMenosParticipativo;
    }


    //Este método es usado por el método "seleccionarAlumnoMenosParticipaticvo" para que pueda cargar el archivo XML con las participaciones actualizadas
    // y "resetearParticipaciones" para poner a 0 las diferentes participaciones de los Alumnos
    //Como parámetro recibe una ruta donde se encuentra un archivo XML que pasará a una lista
    public static List<Estudiante> pasarXML_A_Lista(String rutaXML) {
        try {
            //Crea una Lista y un Archivo que cargará el archivo en la ruta indicada
            List<Estudiante> listaestudiantes = new LinkedList<>();
            File file = new File(rutaXML);
            //Parseamos el fichero al Document
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = null;
            builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            //Creamos una NodeList que irá guardando los elementos de la lista según el nombre de la etiqueta, en este caso "estudiante"
            NodeList estudiantes = document.getElementsByTagName("estudiante");

            //Con un bucle vamos iterando sobre los distintos nodos del XML e introduciendo los valores de las etiquetas "nombre"
            //y "participacion" en su correspondiente etiqueta "estudiante"
            for (int i = 0; i < estudiantes.getLength(); i++) {
                Node node = estudiantes.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) node;
                    Estudiante estudiante = new Estudiante();
                    estudiante.setNombre(eElement.getElementsByTagName("nombre").item(0).getTextContent());
                    estudiante.setParticipacion(Integer.parseInt(eElement.getElementsByTagName("participacion").item(0).getTextContent()));

                    //Se va añadiendo cada estudiante con sus atributos ya recibidos en la lista
                    listaestudiantes.add(estudiante);
                }
            }
            //Se devuelve la lista
            return listaestudiantes;
        } catch (ParserConfigurationException e) {
            System.out.println("Ha fallado el parseo " + e.getMessage());
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Ha fallado la entrada/salida " + e.getMessage());
            throw new RuntimeException(e);
        } catch (SAXException e) {
            System.out.println("Ha fallado el parseo a XML " + e.getMessage());
            throw new RuntimeException(e);
        }
    }


    //Este método pone a 0 las participaciones de todos los alumnos en un archivo XML
    //Como parámetro recibe la ruta del archivo XMl del que se desea poner las participaciones a 0
    public static void resetearParticipaciones(String rutaParaResetear) {
        //Crea la lista a partir del XML con el método anterior
            List<Estudiante> listaEstudiantes = null;
            listaEstudiantes = pasarXML_A_Lista(rutaParaResetear);
            //Con un bucle vamos poniendo la participación de cada alumno a 0
            for (int i = 0; i < listaEstudiantes.size(); i++){
                listaEstudiantes.get(i).setParticipacion(0);
            }
            //Y finalmente se importa el archivo, así acabamos con el mismo XML pero con todas las participaciones en 0
            importarXML(listaEstudiantes,rutaParaResetear);
            System.out.println("Se han reseteado las participaciones de los Alumnos");
    }
}
