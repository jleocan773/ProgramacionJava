package org.ieslosremedios.daw.alumnoaleatorio;


import java.util.Random;

public class SeleccionarAlumnoAleatorio {
    public static void main(String[] args) {
         Alumno Pablo = new Alumno("Pablo Mateos Palas", 0),
                David = new Alumno("David Gutierrez Perez",0),
                JuanMaria = new Alumno("Juan María Mateos Ponce", 0),
                Jossie = new Alumno("Jossie Allisson Yovera Consuelo",  0),
                Victor = new Alumno("Victor Chacón Calle", 0),
                Jose = new Alumno("José Ramirez Sanchez", 0),
                Jorge = new Alumno("Jorge Coronil Villalba", 0),
                Ricardo = new Alumno("Ricardo Gabriel Moreno Cantea", 0),
                Adrian = new Alumno("Adrián Merino Gamaza", 0),
                JuanManuelH = new Alumno("Juan Manuel Herrera Ramírez", 0),
                DanielAlfonso = new Alumno("Daniel Alfonso Rodríguez Santos", 0),
                Diego = new Alumno("Diego González Romero", 0),
                Jonathan = new Alumno("Jonathan León Canto", 0),
                JuanManuelS = new Alumno("Juan Manuel Saborido Baena", 0),
                Julian = new Alumno("Julian García Velázquez", 0),
                JoseAntonio = new Alumno("Jose Antonio Jaén Gómez", 0),
                AntonioJesus = new Alumno("Antonio Jesús Téllez Perdigones", 0);

         Alumno[] alumnos = {Pablo, David, JuanMaria, Jossie, Victor, Jose, Jorge, Ricardo, Adrian, JuanManuelH, DanielAlfonso, Diego, Jonathan, JuanManuelS, Julian, JoseAntonio, AntonioJesus};

         seleccionarAleatorio(alumnos);
    }

    public static void seleccionarAleatorio(Alumno[] alumnos) {
        Random random = new Random();
        int elegido = random.nextInt(alumnos.length);

        if (alumnos[elegido].participacion > 0) {
            elegido = random.nextInt(alumnos.length);
            System.out.println(alumnos[elegido]);

        }
        else System.out.println(alumnos[elegido]);
        alumnos[elegido].participacion++;
    }
}
