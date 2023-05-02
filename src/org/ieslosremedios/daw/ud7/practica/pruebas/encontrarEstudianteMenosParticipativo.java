package org.ieslosremedios.daw.ud7.practica.pruebas;

import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import java.util.List;

public class encontrarEstudianteMenosParticipativo {
    public Estudiante encontrarEstudianteMenosParticipativo(List<Estudiante> listaEstudiantes) {
        Estudiante estudianteMenosParticipativo = listaEstudiantes.get(0);
        for (int i = 1; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getParticipacion() < estudianteMenosParticipativo.getParticipacion()) {
                estudianteMenosParticipativo = listaEstudiantes.get(i);
            }
        }
        return estudianteMenosParticipativo;
    }
}

