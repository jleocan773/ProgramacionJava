//package org.ieslosremedios.daw.alumnoaleatorio;
//import org.ieslosremedios.daw.aaa_clases_universales.Estudiante;
//
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class SeleccionarAlumnoAleatorio {
//    public static void main(String[] args) throws IOException {
//        Estudiante Pablo = new Estudiante("Pablo Mateos Palas", 0),
//                JuanMaria = new Estudiante("Juan María Mateos Ponce", 0),
//                Victor = new Estudiante("Victor Chacón Calle", 0),
//                Jose = new Estudiante("José Ramirez Sanchez", 0),
//                Jorge = new Estudiante("Jorge Coronil Villalba", 0),
//                Ricardo = new Estudiante("Ricardo Gabriel Moreno Cantea", 0),
//                Adrian = new Estudiante("Adrián Merino Gamaza", 0),
//                JuanManuelH = new Estudiante("Juan Manuel Herrera Ramírez", 0),
//                DanielAlfonso = new Estudiante("Daniel Alfonso Rodríguez Santos", 0),
//                Diego = new Estudiante("Diego González Romero", 0),
//                Jonathan = new Estudiante("Jonathan León Canto", 0),
//                JuanManuelS = new Estudiante("Juan Manuel Saborido Baena", 0),
//                Julian = new Estudiante("Julian García Velázquez", 0),
//                JoseAntonio = new Estudiante("Jose Antonio Jaén Gómez", 0),
//                AntonioJesus = new Estudiante("Antonio Jesús Téllez Perdigones", 0);
//
//        List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
//        listaEstudiantes.add(DanielAlfonso);
//        listaEstudiantes.add(JuanManuelH);
//        listaEstudiantes.add(Jonathan);
//
//        System.out.println(listaEstudiantes);
//        //crearFicheroEstudiantes(listaEstudiantes);
//        System.out.println(seleccionarAleatorio(listaEstudiantes));
//
//    }
//
//
//    public static void crearFicheroEstudiantes(List<Estudiante> listaEstudiantes) throws IOException {
//        File ficheroDeEstudiantes = new File("C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\estudiantes.txt");
//        FileWriter fw = new FileWriter(ficheroDeEstudiantes);
//        fw.write(listaEstudiantes.toString());
//        fw.close();
//    }
//
//    public static Estudiante seleccionarAleatorio(List<Estudiante> estudiantes) throws IOException {
//        Random random = new Random();
//        int elegido = random.nextInt(estudiantes.size());
//
//        if (estudiantes.get(elegido).getParticipacion() > 0) {
//            elegido = random.nextInt(estudiantes.size());
//            System.out.println("Se ha elegido a " + estudiantes.get(elegido) + "ahora su participación es " + estudiantes.get(elegido).getParticipacion());
//            FileWriter fw = new FileWriter("src/org/ieslosremedios/daw/alumnoaleatorio/alumnos.xml");
//            fw.write(estudiantes.toString());
//            fw.close();
//            return estudiantes.get(elegido);
//        }
//        else
//        System.out.println("Se ha elegido a " + estudiantes.get(elegido).nombre + " ahora su participación es " + estudiantes.get(elegido).getParticipacion());
//        FileWriter fw = new FileWriter("src/org/ieslosremedios/daw/alumnoaleatorio/alumnos.xml");
//        fw.write(estudiantes.toString());
//        fw.close();
//        return (estudiantes.get(elegido));
//    }
//
//
//
//
//}
