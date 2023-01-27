package org.ieslosremedios.daw.ud4.ejemplos.operacionesarray.eliminar;
import java.util.Arrays;


public class EliminarPosArray {
    public static void main(String[] args) {

        //Creo el array del cual se eliminara una posicion X
        int[] arrayAEliminar = {5,46,3,9};

        //Invoco el método creado abajo indicando el array del que quiero borrar la posición y que posición quiero borrar
        //y el resultado de este lo guardo en un array "a" de tipo int.
        int[] a = eliminarPosicion(arrayAEliminar, 0);

        //Pinto el array
        System.out.println(Arrays.toString(a));
            }

    public static int[] eliminarPosicion( int[] a, int pos ) {

        //El array que se creará tendrá una longitud menor en 1 (uno).
        int[] arrayPostEliminado = new int[a.length - 1];

        //Esta variable tendrá el valor de los elementos que no se han copiado después de haber borrado la posición
        // indicada por "pos", la cual será la longitud del array menos la suma de "pos" + 1.
        int posicionesRestantes = a.length - (pos + 1);

        //Se copia el array hasta la posición que pretendemos eliminar, la cual es indicada por "pos".
        System.arraycopy(a, 0, arrayPostEliminado, 0, pos);

        //Se copia el resto del array, desde "pos" + 1, saltándonos la posición que hemos eliminado, siendo la longitud
        //el valor de la variable "posicionesRestantes", que indica cuantas posiciones había después de "pos".
        System.arraycopy(a, pos + 1, arrayPostEliminado, pos, posicionesRestantes);
        //System.out.println(Arrays.toString(arrayPostEliminado));    }
        return arrayPostEliminado;
    }
}



