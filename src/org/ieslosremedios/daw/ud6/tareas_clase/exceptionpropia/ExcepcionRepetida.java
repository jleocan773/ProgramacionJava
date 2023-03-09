package org.ieslosremedios.daw.ud6.tareas_clase.exceptionpropia;
import java.util.ArrayList;

public class ExcepcionRepetida extends IllegalArgumentException{
    public ExcepcionRepetida(String mensaje){
        super(mensaje);
    }
}
