package org.ieslosremedios.daw.ud4.actividadespractica;

public class QuitarElementosArray {
    public static void main(String[] args) {
        int[] arrayNum = {1,2,3,4,5};

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






}

