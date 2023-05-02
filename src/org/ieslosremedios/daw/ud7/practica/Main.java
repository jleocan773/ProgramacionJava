package org.ieslosremedios.daw.ud7.practica;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.util.*;

public class Main extends  OperacionesApp{
    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserConfigurationException, TransformerException, SAXException {
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


        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);
        //System.out.println(listaEstudiantes);

        //Opciones para el menú:
        //exportarXML(listaEstudiantes, "src/org/ieslosremedios/daw/ud7/practica/alumnos.xml");
        //importarXML("src/org/ieslosremedios/daw/ud7/practica/alumnos.xml", "src/org/ieslosremedios/daw/ud7/practica/ficheroImportado.xml");
        //seleccionarAleatorio(listaEstudiantes,"src/org/ieslosremedios/daw/ud7/practica/alumnos.txt");


    }
}
