package org.ieslosremedios.daw.examen_tema5.Ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Ejercicio2 {
    public static void main(String[] args) {

        // TODO: Lista original con todos los ficheros originales
        ArrayList<Fichero> ficheros = new ArrayList<>();

        ficheros.add(new Fichero("hola.txt", 1000.0));
        ficheros.add(new Fichero("adios.dat", 1500.0));
        ficheros.add(new Fichero("ejercicio1.doc", 800.0));
        ficheros.add(new Fichero("ejercicio2.txt", 1200.0));
        ficheros.add(new Fichero("ejercicio2.odt", 2200.0));
        ficheros.add(new Fichero("cuentas.xls", 9300.0));
        ficheros.add(new Fichero("libros_nuevos.txt", 250.0));
        ficheros.add(new Fichero("contactos.cvs", 725.0));

        //TODO: Copia para no modificar la lista original. Ten en cuenta el tipo de implementación más adecuada porque vamos a hacer operaciones
        // de escritura con ella.
        //Podemos crear una copia simplemente igualándola a una existente en el momento de declararla
        ArrayList<Fichero> copiaFicheros = new ArrayList<>(ficheros);

        // TODO: Imprime la lista de ficheros ordenados por nombre descendentemente
        //Creamos un Comparador en el que decimos que el orden será por nombre descendentemente, es decir, desde la A hasta la Z
        //Si quisiese mos invertir el orden simplemente usaríamos el método "reverse" que nos proporciona el Comparador
        copiaFicheros.sort(new ComparadorNombre());
        copiaFicheros.sort(Comparator.reverseOrder());
        System.out.println(copiaFicheros);

        // TODO: Renombra la extensión de los .txt a .md
        //Para renombrar un fichero accedemos a la posición del índice de este con "get" y usamos el "setNombre" de Fichero para cambiarlo
        copiaFicheros.get(5).setNombre("ejercicio2.md");
        copiaFicheros.get(6).setNombre("hola.md");
        copiaFicheros.get(7).setNombre("libros_nuevos.md");
        System.out.println(copiaFicheros);

        // TODO: Elimina los ficheros que ocupen más de 1Kbyte y menos de 2Kbytes
        //Para eliminar un archivo usamos el método "remove" y le decimos el índice de este, aquí hay que tener cuidado puesto que después de cada
        //ejecución del método el tamaño de la lista va a cambiar, y  con este el índice de sus elementos
        copiaFicheros.remove(0);
        copiaFicheros.remove(4);
        copiaFicheros.remove(4);
        System.out.println(copiaFicheros);

        // TODO: Imprime la lista de ficheros ordenados por tamaño ascendente
        //Creamos un nuevo Comparador, esta vez ordena por el tamaño de los ficheros, del menor al mayor
        copiaFicheros.sort(new ComparadorTamaño());
        System.out.println(copiaFicheros);

        // TODO: Añade un nuevo fichero llamado "prueba.txt" en la posición penúltima
        //Para añadir un fichero usamos el método "add" y como lo queremos en la posición penúltima usamos el método size (que nos dará el tamaño de la lista)
        //y le restamos una porque lo queremos en la penúltima, no la última
        copiaFicheros.add(copiaFicheros.size() - 1, new Fichero("prueba.txt", 1500.00));
        System.out.println(copiaFicheros);

        // TODO: Reemplaza el fichero "prueba.txt" por otro nuevo llamado "prueba2.txt"
        //Para reemplazar usamos el método "set", como ahora le tenemos que decir cual sustituir en lugar del índice, es decir, empezamos en 1 y no en 0
        // le restamos 2, puesto que el elemento que queremos sustituir está en la penúltima posición
        copiaFicheros.set(copiaFicheros.size() - 2, new Fichero("prueba2.txt", 5000.00));
        System.out.println(copiaFicheros);

        // TODO: Cuenta cuántos ficheros con extensión .md existen
        //Aquí habría que usar un iterator y recorrer la lista comprobando que el nombre concuerde con una expresión regular como "md$" para indicar que queremos
        //contar solo los archivos que terminan en md
        //Pero no me da tiempo a terminarlo :(
//        ListIterator listIterator = copiaFicheros.listIterator();
//        while (listIterator.hasNext()){
//            if (listIterator.next().get)
//        }


        //Ejecutamos el método de abajo
        ls(ficheros);

    }

    /**
     * Lista los ficheros por, cada uno en una línea, con su nombre y tamaño. Ej:
     * Nombre     Tamaño
     * ------     ------
     * libros_nuevos.txt   250.0
     * hola.txt    1000.0
     * ejercicio2.txt  1200.0
     * ejercicio2.odt  2200.0
     * ejercicio1.doc  800.0
     * cuentas.xls 9300.0
     * contactos.cvs   725.0
     * adios.dat   1500.0
     * @param ficheros La lista de ficheros
     */
    static void ls (List<Fichero> ficheros) {
        //Pintamos la cabecera
        System.out.println("Nombre            Tamaño");
        System.out.println("------            ------");
        //Creamos un iterador para recorrer la lista
        ListIterator<Fichero> listIterator = ficheros.listIterator();
        //Mientras que siga teniendo un elemento siguiente, mostraremos el nombre de ese elemento, unos cuantos espacios y su tamaño
        while(listIterator.hasNext()){
            Fichero fichero = listIterator.next();
            System.out.println(fichero.getNombre() + "          " + fichero.getTamaño());
        }
    }
}
