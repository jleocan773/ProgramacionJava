package org.ieslosremedios.daw.ud9.ejemplos;

import java.awt.*;

public class InterfazHolaMundo {
    public static void main(String[] args) {

        //Contenedor
        Frame frame = new Frame("Hola Mundo");

        frame.setBackground(Color.cyan);
        frame.setLayout(null);
        frame.setSize(300,300);
        frame.setVisible(true);

        //Control
        Button button = new Button("Hola");
        button.setBounds(125, 125, 50, 50);
        //Metemos el botón en el contenedor
        frame.add(button);

    }
}
