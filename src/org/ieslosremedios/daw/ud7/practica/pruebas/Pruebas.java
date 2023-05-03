package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ExportarXML.exportarXML;
import static org.ieslosremedios.daw.ud7.practica.pruebas.ImportarXML.importarXML;
import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_Lista.PasarXMLaLista;
import static org.ieslosremedios.daw.ud7.practica.pruebas.SeleccionarAleatorio.seleccionarAleatorio;

public class Pruebas {
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException, SAXException, JAXBException {
        Estudiante Pablo = new Estudiante("Pablo Mateos Palas", 0),
                JuanMaria = new Estudiante("Juan María Mateos Ponce", 0),
                Victor = new Estudiante("Victor Chacón Calle", 0),
                Jose = new Estudiante("José Ramirez Sanchez", 0),
                Jorge = new Estudiante("Jorge Coronil Villalba", 0),
                Ricardo = new Estudiante("Ricardo Gabriel Moreno Cantea", 0),
                Adrian = new Estudiante("Adrián Merino Gamaza", 0),
                JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Diego = new Estudiante("Diego González Romero", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0),
                JuanManuelS = new Estudiante("Juan Manuel Saborido Baena", 0),
                Julian = new Estudiante("Julian García Velázquez", 0),
                JoseAntonio = new Estudiante("Jose Antonio Jaén Gómez", 0),
                AntonioJesus = new Estudiante("Antonio Jesús Téllez Perdigones", 0);

        final String ruta = "src/org/ieslosremedios/daw/ud7/practica/pruebas/pruebas.txt";
        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);
        //System.out.println(listaEstudiantes);

        List<Estudiante> prueba = new ArrayList<>();

        //exportarXML(listaEstudiantes,"src/org/ieslosremedios/daw/ud7/practica/pruebas/alumnos.xml");
        //importarXML("src/org/ieslosremedios/daw/ud7/practica/pruebas/alumnos.xml", "src/org/ieslosremedios/daw/ud7/practica/pruebas/ficheroImportado.xml");
        //seleccionarAleatorio(listaEstudiantes, "src/org/ieslosremedios/daw/ud7/practica/pruebas/alumnos.xml");
        prueba = PasarXMLaLista("src/org/ieslosremedios/daw/ud7/practica/pruebas/alumnos.xml");
        System.out.println(prueba);
    }
}