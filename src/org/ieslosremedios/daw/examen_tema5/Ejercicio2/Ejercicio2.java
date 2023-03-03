package org.ieslosremedios.daw.examen_tema5.Ejercicio2;

import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {

        // TODO: Lista original con todos los ficheros originales
        List<Fichero> ficheros = new LinkedList<>();

        Fichero fichero1 = new Fichero("hola.txt", 1000.0);
        Fichero fichero2 = new Fichero("adios.dat", 1500.0);
        Fichero fichero3 = new Fichero("ejercicio1.doc", 800.0);
        Fichero fichero4 = new Fichero("ejercicio2.txt", 1200.0);
        Fichero fichero5 = new Fichero("ejercicio2.odt", 2200.0);
        Fichero fichero6 = new Fichero("cuentas.xls", 9300.0);
        Fichero fichero7 = new Fichero("libros_nuevos.txt", 250.0);
        Fichero fichero8 = new Fichero("contactos.cvs", 725.0);

        ficheros.add(fichero1);
        ficheros.add(fichero2);
        ficheros.add(fichero3);
        ficheros.add(fichero4);
        ficheros.add(fichero5);
        ficheros.add(fichero6);
        ficheros.add(fichero7);
        ficheros.add(fichero8);

//        ficheros.add(new Fichero("hola.txt", 1000.0));
//        ficheros.add(new Fichero("adios.dat", 1500.0));
//        ficheros.add(new Fichero("ejercicio1.doc", 800.0));
//        ficheros.add(new Fichero("ejercicio2.txt", 1200.0));
//        ficheros.add(new Fichero("ejercicio2.odt", 2200.0));
//        ficheros.add(new Fichero("cuentas.xls", 9300.0));
//        ficheros.add(new Fichero("libros_nuevos.txt", 250.0));
//        ficheros.add(new Fichero("contactos.cvs", 725.0));


        //TODO: Copia para no modificar la lista original. Ten en cuenta el tipo de implementación más adecuada porque vamos a hacer operaciones
        // de escritura con ella.
        //Podemos hacer una copia si simplemente creamos una nueva lista y la igualamos a la que ya tenemos creada
        //Esta copia será, por supuesto, del mismo tipo
        List<Fichero> copiaLista = ficheros;


        // TODO: Imprime la lista de ficheros ordenados por nombre descendentemente
        copiaLista.sort(new ComparadorNombre().reversed());
        System.out.println(copiaLista);

        // TODO: Renombra la extensión de los .txt a .md
        // Aquí iría otra expresión regular que comprueba que el final de los archivos acaba en .md (*.md$)
        fichero1.setNombre("Hola.md");
        fichero4.setNombre("ejercicio2.md");
        fichero7.setNombre("libros_nuevos.md");
        System.out.println(copiaLista);

        // TODO: Elimina los ficheros que ocupen más de 1Kbyte y menos de 2Kbytes

        //TODO: Imprime la lista de ficheros ordenados por tamaño ascendente
        // el método compareTo de tamaño está comentado
        copiaLista.sort(new ComparadorTamaño());
        System.out.println(copiaLista);

        // TODO: Añade un nuevo fichero llamado "prueba.txt" en la posición penúltima
        Fichero ficheroNuevo = new Fichero("prueba.cvs", 550.0);
        copiaLista.add(copiaLista.size()-1, ficheroNuevo);
        System.out.println(copiaLista);

        // TODO: Reemplaza el fichero "prueba.txt" por otro nuevo llamado "prueba2.txt"
        Fichero ficheroReemplazo = new Fichero("prueba2.txt", 1725.0);
        copiaLista.set(copiaLista.size()-1, ficheroReemplazo);
        System.out.println(copiaLista);

        // TODO: Cuenta cuántos ficheros con extensión .md existen
        Iterator it = copiaLista.listIterator();
        int contador = 0;
        //Aquí iría la condición con una expresión regular de que el archivo acabe en .md que sería algo como *.md$
        //pero no me da tiempo hacerlo
        while(it.hasNext()){
            if (it.next() == "Hola.md"){
                contador++;
            }
            System.out.println(contador);
        }
    }

    /**
     * Lista los ficheros por, cada uno en una línea, con su nombre y tamaño. Ej.:
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

    }

}
