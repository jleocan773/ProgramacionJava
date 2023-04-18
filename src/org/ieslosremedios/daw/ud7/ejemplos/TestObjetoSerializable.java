package org.ieslosremedios.daw.ud7.ejemplos;

import java.io.*;

public class TestObjetoSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //Creo el objeto que se serializará para escribirlo en un fichero
        ObjetoSerializable os1 = new ObjetoSerializable(666,999,1000);

        //Creo un fichero
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\ObjetoSerializable.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //Serializamos el objeto
        oos.writeObject(os1);

        //Se cierra el flujo para que se termine de escribir en el fichero
        oos.close();


        //Para leer el fichero usamos los InputStream pertinentes
        FileInputStream fis = new FileInputStream("C:\\Users\\1DAW_2223_01\\Desktop\\Programación\\Unidad-7\\ObjetoSerializable.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);

        //Desearizar el contenido del fichero (bytes) a un Object, hace falta hacer el casting
        ObjetoSerializable osSalida = (ObjetoSerializable) ois.readObject();

        System.out.println("Atributo 1 " + osSalida.atributo1);
        System.out.println("Atributo 2 " + osSalida.atributo2);
        System.out.println("Atributo Transient " + osSalida.atributoTransient);


        //Cerrar el flujo del ObjectInputStream
        ois.close();


    }
}
