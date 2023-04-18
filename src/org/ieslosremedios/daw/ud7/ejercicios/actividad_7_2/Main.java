package org.ieslosremedios.daw.ud7.ejercicios.actividad_7_2;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;


//Se pide realizar un programa que haga lo siguiente:
public class Main {
    public static void main(String[] args) throws IOException, FileAlreadyExistsException {
        //Crea un fichero llamado alumnos.txt dentro de una nueva carpeta con nombre 1DAW, controlando que si ya existe no haga nada. La carpeta debe estar en la raíz de tu usuario.
        File archivo = new File("C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\alumnos.txt");

        //Introduce los nombres de los alumnos de la clase, un alumno por línea del fichero. Utiliza un buffer para realizar esta operación
        FileOutputStream fos = new FileOutputStream(archivo);
        BufferedOutputStream bufer = new BufferedOutputStream(fos);
        bufer.write("Pablo Mateos Palas\n".getBytes());
        bufer.write("David Gutierrez Perez\n".getBytes());
        bufer.write("Juan María Mateos Ponce\n".getBytes());
        bufer.write("Jossie Allisson Yovera Consuelo\n".getBytes());
        bufer.write("Victor Chacón Calle\n".getBytes());
        bufer.write("José Ramirez Sanchez\n".getBytes());
        bufer.write("Jorge Coronil Villalba\n".getBytes());
        bufer.write("Ricardo Gabriel Moreno Cantea\n".getBytes());
        bufer.write("Adrián Merino Gamaza\n".getBytes());
        bufer.write("Juan Manuel Herrera Ramírez\n".getBytes());
        bufer.write("Daniel Alfonso Rodríguez Santos\n".getBytes());
        bufer.write("Diego González Romero\n".getBytes());
        bufer.write("Jonathan León Canto\n".getBytes());
        bufer.write("Juan Manuel Saborido Baena\n".getBytes());
        bufer.write("Julian García Velázquez\n".getBytes());
        bufer.write("Jose Antonio Jaén Gómez\n".getBytes());
        bufer.write("Antonio Jesús Téllez Perdigones\n".getBytes());
        bufer.close();
        fos.close();

        // Copia (lee y escribe) el contenido del anterior fichero a uno nuevo con nombre prog.txt

        FileInputStream fisParaCopiar = new FileInputStream(archivo);
        FileOutputStream fosParaCopiar = new FileOutputStream("C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\prog.txt");
        byte[] bufferParaCopiar = new byte[1024];
        int longitudBuffer;
        while ((longitudBuffer = fisParaCopiar.read(bufferParaCopiar)) > 0) {
            fosParaCopiar.write(bufferParaCopiar, 0, longitudBuffer);
        }
        fisParaCopiar.close();
        fosParaCopiar.close();


        //Renombra el fichero a prog_codificado.txt
        Files.move(Path.of("C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\prog.txt"), Path.of("C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\prog_codificado.txt"));

        //En este último fichero, añade al final un alumno nuevo
        Files.write(Path.of("C:\\Users\\LionPride\\Desktop\\Instituto\\Java\\prog_codificado.txt"), "Un alumno nuevo".getBytes(), StandardOpenOption.APPEND);

        //Sustituye el segundo y tercer carácter del nombre de cada alumno por una X


    }
}
