package org.ieslosremedios.daw.ud7.practica.pruebas.paraentregar;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main extends OperacionesApp {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException, ClassNotFoundException, JAXBException {
        Estudiante JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);


        //exportarXML(listaEstudiantes,"src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml");
        //importarXML("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml", "src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/ficheroImportado.xml");
        seleccionarAleatorio(listaEstudiantes, "src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml");

    }



}
