package org.ieslosremedios.daw.ud7.tareas_clase.Ejercicio11;
import org.ieslosremedios.daw.aaa_clases_universales.Direccion;
import org.ieslosremedios.daw.aaa_clases_universales.Persona;
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
import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) throws TransformerException, ParserConfigurationException {
        Direccion direccion1 = new Direccion("Aquí vive la Primera Persona");
        Persona persona1 = new Persona("Primera", "Persona Falsa", direccion1);

        Direccion direccion2 = new Direccion("Aquí vive la Segunda Persona");
        Persona persona2 = new Persona("Segunda", "Persona Falsa", direccion2);

        Direccion direccion3 = new Direccion("Aquí vive la Tercera Persona");
        Persona persona3 = new Persona("Tercera", "Persona Falsa", direccion3);

        List<Persona> listaContactos = new ArrayList<>();
        listaContactos.add(persona1);
        listaContactos.add(persona2);
        listaContactos.add(persona3);

        // Creamos el documento vacío para añadirle a continuación los nodos
        // En este caso lo hago en una sola línea
        Document document = DocumentBuilderFactory.newDefaultInstance().newDocumentBuilder().newDocument();

        // Creamos el nodo raíz
        Element contactos = document.createElement("contactos");
        // Hacemos que cuelgue del documento (estructura de árbol)
        document.appendChild(contactos);

        // Creamos el primer nodo y lo colgamos de su padre, el nodo raíz. --> contactos
        Element contacto1 = document.createElement("contacto");
        contactos.appendChild(contacto1);

        //Primer Contacto
        Element nombreContacto1 = document.createElement("nombre");
        contacto1.appendChild(nombreContacto1);
        Element apellidosContacto1 = document.createElement("apellidos");
        contacto1.appendChild(apellidosContacto1);
        Element direccionContacto1 = document.createElement("direccion");
        contacto1.appendChild(direccionContacto1);

        Text textNombreContacto1 = document.createTextNode(persona1.getNombre());
        nombreContacto1.appendChild(textNombreContacto1);
        Text textApellidoContacto1 = document.createTextNode(persona1.getApellidos());
        apellidosContacto1.appendChild(textApellidoContacto1);
        Text textDireccionContacto1 = document.createTextNode(persona1.direccion.getCalle());
        direccionContacto1.appendChild(textDireccionContacto1);

        //Segundo Contacto
        Element contacto2 = document.createElement("contacto");
        contactos.appendChild(contacto2);

        Element nombreContacto2 = document.createElement("nombre");
        contacto2.appendChild(nombreContacto2);
        Element apellidosContacto2 = document.createElement("apellidos");
        contacto2.appendChild(apellidosContacto2);
        Element direccionContacto2 = document.createElement("direccion");
        contacto2.appendChild(direccionContacto2);

        Text textNombreContacto2 = document.createTextNode(persona2.getNombre());
        nombreContacto2.appendChild(textNombreContacto2);
        Text textApellidoContacto2 = document.createTextNode(persona2.getApellidos());
        apellidosContacto2.appendChild(textApellidoContacto2);
        Text textDireccionContacto2 = document.createTextNode(persona2.direccion.getCalle());
        direccionContacto2.appendChild(textDireccionContacto2);

        //Tercer Contacto
        Element contacto3 = document.createElement("contacto");
        contactos.appendChild(contacto3);

        Element nombreContacto3 = document.createElement("nombre");
        contacto3.appendChild(nombreContacto3);
        Element apellidosContacto3 = document.createElement("apellidos");
        contacto3.appendChild(apellidosContacto3);
        Element direccionContacto3 = document.createElement("direccion");
        contacto3.appendChild(direccionContacto3);

        Text textNombreContacto3 = document.createTextNode(persona3.getNombre());
        nombreContacto3.appendChild(textNombreContacto3);
        Text textApellidoContacto3 = document.createTextNode(persona3.getApellidos());
        apellidosContacto3.appendChild(textApellidoContacto3);
        Text textDireccionContacto3 = document.createTextNode(persona3.direccion.getCalle());
        direccionContacto3.appendChild(textDireccionContacto3);

        // Clases necesarias para finalizar la creación del archivo XML
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(new File("src/org/ieslosremedios/daw/ud7/tareas_clase/Ejercicio11/contactosDeJonathan.xml"));

        // Se realiza la transformación, de Document a Fichero.
        transformer.transform(source, result);




    }
}
