package org.ieslosremedios.daw.ud9.tareas_clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EjemploBorderLayout {

    Frame ventanaPrincipal;

    public static void main(String[] args) {
        new EjemploBorderLayout();
    }

    EjemploBorderLayout(){
        ventanaPrincipal = new Frame("Border Layout");
        ventanaPrincipal.setBackground(Color.lightGray);
        ventanaPrincipal.setSize(375,250);
        ventanaPrincipal.setVisible(true);

        Button arriba = new Button("Arriba");
        Button abajo = new Button("Abajo");
        Button centro = new Button("Centro");
        Button izquierda = new Button("Izquierda");
        Button derecha = new Button("Derecha");

        ventanaPrincipal.add(arriba, BorderLayout.NORTH);
        ventanaPrincipal.add(abajo, BorderLayout.SOUTH);
        ventanaPrincipal.add(centro, BorderLayout.CENTER);
        ventanaPrincipal.add(izquierda, BorderLayout.WEST);
        ventanaPrincipal.add(derecha, BorderLayout.EAST);

        ventanaPrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaPrincipal.dispose();
            }
        });
    }


}
