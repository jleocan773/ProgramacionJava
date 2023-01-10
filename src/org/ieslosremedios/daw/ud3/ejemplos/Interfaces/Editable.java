package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

/**8.- Crea una nueva interfaz llamada “Editable” y traspasa (corta y pega) el método “establecerContenido” a ella.
//Luego haz que “Imprimible” herede tanto de “Borrable” como de “Imprimible”.

//¿Sigue funcionando igual? ¿Por qué?

 Sí, sigue funcionando igual, porque es posible que una interfaz herede de varias interfaces, al contrario que una clase, que solo puede heredar de una */

public interface Editable extends Borrable, Imprimible{
    void establecerContenido(String contenido); //8.- Traspasa (corta y pega) el método “establecerContenido”

}
