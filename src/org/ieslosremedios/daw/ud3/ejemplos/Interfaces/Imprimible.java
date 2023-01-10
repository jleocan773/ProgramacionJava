package org.ieslosremedios.daw.ud3.ejemplos.Interfaces;

public interface Imprimible { //Creamos la interfaz "Imprimible"
    final String TEXTO_POR_DEFECTO = "Página de Prueba"; //Creamos e inicializamos la constante "TEXT_POR_DEFECTO" con el valor "Página de prueba"
    void Imprime(); //Definimos un método, el cual no devuelve nada y no tiene parámetros

    void establecerContenido(String contenido); //Añade a la interfaz un nuevo método “establecerContenido"
}
