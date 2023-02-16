package org.ieslosremedios.daw.ud4.actividadespractica;

import java.util.Arrays;

public class QuitarElementosArrayResuelto {
    public static void main(String[] args) {
    int[] arrayNum = {1,2,3,4,5};


        arrayNum = quitarElementoArray(arrayNum, 4);
        System.out.println(Arrays.toString(arrayNum));


    }


    //TODO 7. Write a Java program to remove a specific element from an array.
    // para eliminar la posición de un Array, tenemos que hacer un clon de este, lo más fácil es utilizar el "System.arraycopy"
    // el "System.arraycopy" funciona de la siguiente manera:
    // System.arraycopy(arrayOriginal, 0, arrayConElementoBorrado, 0, longitudDelArrayConElementoBorrado)
    // donde -> "arrayOriginal" representa el array del que vamos a hacer la copia
    //          el primer 0 representa desde donde vamos a empezar a copiar
    //          arrayConElementoBorrado será el clon del array, el cual debe de estar declarado previamente
    //          el segundo 0 representa desde donde se va a empezar a copiar el arrayOriginal en el arrayConElementoBorrado
    //          longitudDelArrayConElementoBorrado representa la longitud que tendrá el clon

    //TODO En definitiva, tendrás que:
    // Crear un método que devuelva un array de tipo int, que recibirá por parte del usuario un array y una posición
    // Crear un array para meterle un clon del array introducido por el usuario, a este array se le borrará una posición, por lo tanto, si se le va a borrar una
    //      posición ¿cuál sería su longitud?
    // Realizar la copia del array con "System.arraycopy", indicando que la longitud del clon será HASTA EL ELEMENTO A ELIMINAR
    // Ahora, después de haber hecho ese clonado, es posible que nos queden posiciones por copiar, es decir, si el array es de longitud 4 y queremos borrar la 2,
    // nos quedarían 2 posiciones por copiar
    // Así que habrá que crear una variable de tipo int que almacene cuantas posiciones nos quedan por copiar, las posiciones restantes siempre serán la longitud del
    //      array original - ( la posición a eliminar + 1)
    // Ya con esto hecho nos quedaría volver a usar "System.arraycopy", copiando desde el array original, ahora desde la posición a eliminar + 1 (porque no queremos
    //      copiar esta) a el array con la posición borrada, empezando por la posición borrada, ya que esta es la que no queremos, y la longitud será el número de
    //      posiciones restantes.

    //Creo el método quitarElementoArray, que devolverá un array de tipo int, y tiene como parámetros un array de tipo entero y un int, que será la posición a borrar
    private static int[] quitarElementoArray (int[] array, int posicionAEliminar){
        //Creo un array que recibirá la copia
        int[] arrayPostEliminado = new int[array.length - 1];
        //Hago la copia del array original en la posición 0 al arrayPostEliminado en la posición cero, la longitud del clonado será hasta la posición a eliminar
        System.arraycopy(array, 0, arrayPostEliminado, 0, posicionAEliminar);
        //Creo la variable de tipo entero que contendrá las posiciones que faltan por copiar
        int posicionesRestantes = array.length - (posicionAEliminar + 1);
        //Uso el método de antes, copiando esta vez desde la posicionAEliminar + 1, porque nos queremos saltar esa posición, y queremos que se empiece a copiar desde
        // la posición a eliminar, la longitud será el número de posiciones que faltan por copiar
        System.arraycopy(array, posicionAEliminar + 1, arrayPostEliminado, posicionAEliminar, posicionesRestantes);


        return arrayPostEliminado;
    }


// POR SI QUIERES COPIARLO SIN LOS COMENTARIOS
//
//    private static int[] quitarElementoArray (int[] array, int posicionAEliminar){
//        int[] arrayPostEliminado = new int[array.length - 1];
//        System.arraycopy(array, 0, arrayPostEliminado, 0, posicionAEliminar);
//        int posicionesRestantes = array.length - (posicionAEliminar + 1);
//        System.arraycopy(array, posicionAEliminar + 1, arrayPostEliminado, posicionAEliminar, posicionesRestantes);
//
//
//        return arrayPostEliminado;
//    }


}

