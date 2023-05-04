package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import static org.ieslosremedios.daw.ud7.practica.pruebas.ExportarXML.exportarXML;
import static org.ieslosremedios.daw.ud7.practica.pruebas.PasarXML_A_Lista.PasarXMLaLista;

public class SeleccionarAleatorio {
    public static Estudiante seleccionarAleatorio(String rutaParaEscribirFichero) throws ParserConfigurationException, TransformerException, JAXBException, IOException, SAXException {
        List<Estudiante> listaEstudiantes = PasarXMLaLista(rutaParaEscribirFichero);

        Random random = new Random();
        int elegido = random.nextInt(listaEstudiantes.size());

        if (listaEstudiantes.get(elegido).getParticipacion() > 50) {
            elegido = random.nextInt(listaEstudiantes.size());
            listaEstudiantes.get(elegido).setParticipacion(listaEstudiantes.get(elegido).getParticipacion() + 1);
            System.out.println("Se ha elegido a " + listaEstudiantes.get(elegido).getNombre() + "ahora su participación es " + listaEstudiantes.get(elegido).getParticipacion());
            exportarXML(listaEstudiantes, rutaParaEscribirFichero);
            return listaEstudiantes.get(elegido);
        }
        else
            listaEstudiantes.get(elegido).setParticipacion(listaEstudiantes.get(elegido).getParticipacion() + 1);
        System.out.println("Se ha elegido a " + listaEstudiantes.get(elegido).getNombre() + " ahora su participación es " + listaEstudiantes.get(elegido).getParticipacion());
        exportarXML(listaEstudiantes, rutaParaEscribirFichero);
        return (listaEstudiantes.get(elegido));
    }
}
