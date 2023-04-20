package org.ieslosremedios.daw.alumnoaleatorio;
import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeleccionarAlumnoAleatorio {
    public static void main(String[] args) {
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

         Estudiante[] estudiantes = {Pablo, JuanMaria, Victor, Jose, Jorge, Ricardo, Adrian, JuanManuelH, DanielAlfonso, Diego, Jonathan, JuanManuelS, Julian, JoseAntonio, AntonioJesus};
         //seleccionarAleatorio(estudiantes);

        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(Pablo);
        listaEstudiantes.add(JuanMaria);
        listaEstudiantes.add(Jose);
        System.out.println(listaEstudiantes);
        Pablo.participacion +=1;
        System.out.println(listaEstudiantes);
        Pablo.participacion +=1;
        System.out.println(listaEstudiantes);
    }

    public static void seleccionarAleatorio(Estudiante[] estudiantes) {
        Random random = new Random();
        int elegido = random.nextInt(estudiantes.length);

        if (estudiantes[elegido].participacion > 0) {
            elegido = random.nextInt(estudiantes.length);
            System.out.println(estudiantes[elegido]);

        }
        else System.out.println(estudiantes[elegido]);
        estudiantes[elegido].participacion++;
    }
}
