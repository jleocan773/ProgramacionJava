package org.ieslosremedios.daw.aaa_clases_universales;

import java.io.Serializable;
import java.util.List;

public class Estudiantes implements Serializable {
    private List<Estudiante> estudiantes;

    public Estudiantes() {}

    public Estudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}
