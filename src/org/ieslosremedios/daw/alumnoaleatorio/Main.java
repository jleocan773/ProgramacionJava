package org.ieslosremedios.daw.alumnoaleatorio;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main extends ImportarXML{
    public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
        Estudiante JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
                Jonathan = new Estudiante("Jonathan León Canto", 0);

        List<Estudiante> listaEstudiantes = new ArrayList<>();
        listaEstudiantes.add(DanielAlfonso);
        listaEstudiantes.add(JuanManuelH);
        listaEstudiantes.add(Jonathan);

        importarXML(listaEstudiantes);



    }



}
