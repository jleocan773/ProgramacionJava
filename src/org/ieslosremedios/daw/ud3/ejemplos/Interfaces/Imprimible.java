package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

//8.- Haz que “Imprimible” herede tanto de “Borrable” como de “Editable”.
public interface Imprimible extends Borrable, Editable{ //1.- Creamos la interfaz "Imprimible"
    String TEXTO_POR_DEFECTO = "Página de Prueba"; //2.- Creamos e inicializamos la constante "TEXT_POR_DEFECTO" con el valor "Página de prueba"
    void Imprime(); //1.- Definimos un método, que no devuelve nada y no tiene parámetros

    void establecerContenido(String contenido); //5.- Añade a la interfaz un nuevo método “establecerContenido"
}
