package org.ieslosremedios.daw.ud7.practica.pruebas.paraentregar;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ResetearParticipaciones.resetearParticipaciones;


public class Main extends OperacionesApp {
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException, SAXException, ClassNotFoundException, JAXBException {

        //Creamos todos los alumnos de la clase
        Estudiante Pablo = new Estudiante("Pablo Mateos Palas", 5),
                JuanMaria = new Estudiante("Juan María Mateos Ponce", 0),
                Victor = new Estudiante("Victor Chacón Calle", 0),
                Jorge = new Estudiante("Jorge Coronil Villalba", 9),
                Ricardo = new Estudiante("Ricardo Gabriel Moreno Cantea", 4),
                Adrian = new Estudiante("Adrián Merino Gamaza", 4),
                JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 4),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 5),
                Diego = new Estudiante("Diego González Romero", 2),
                Jonathan = new Estudiante("Jonathan León Canto", 5),
                JuanManuelS = new Estudiante("Juan Manuel Saborido Baena", -1),
                Julian = new Estudiante("Julian García Velázquez", 1),
                JoseAntonio = new Estudiante("Jose Antonio Jaén Gómez", 0),
                AntonioJesus = new Estudiante("Antonio Jesús Téllez Perdigones", 2);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(Pablo);
        listaEstudiantes.add(JuanMaria);
        listaEstudiantes.add(Victor);
        listaEstudiantes.add(Jorge);
        listaEstudiantes.add(Ricardo);
        listaEstudiantes.add(Adrian);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(Diego);
        listaEstudiantes.add(Jonathan);
        listaEstudiantes.add(JuanManuelS);
        listaEstudiantes.add(Julian);
        listaEstudiantes.add(JoseAntonio);
        listaEstudiantes.add(AntonioJesus);

        //importarXML(listaEstudiantes,"src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml");
        //exportarXML("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml", "src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/ficheroExportado.xml");
        //System.out.println(seleccionarAlumnoMenosParticipativo("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml"));
        //resetearParticipaciones("src/org/ieslosremedios/daw/ud7/practica/pruebas/paraentregar/alumnos.xml");

    }



}
