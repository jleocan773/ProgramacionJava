package org.ieslosremedios.daw.ud9.tareas_clase;// import statements
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class EjemploCardLayout extends JFrame implements ActionListener
{

    CardLayout cardLayout;
    Container container;

    public static void main(String argvs[])
    {
        EjemploCardLayout crdl = new EjemploCardLayout();

        crdl.setSize(375, 250);
        crdl.setVisible(true);
        crdl.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    EjemploCardLayout()
    {
        container = getContentPane();
        cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        Button boton1 = new Button("Botón 1");
        Button boton2 = new Button("Botón 2");
        Button boton3 = new Button("Botón 3");

        boton1.addActionListener(this);
        boton2.addActionListener(this);
        boton3.addActionListener(this);

        container.add(boton1);
        container.add(boton2);
        container.add(boton3);
    }

    public void actionPerformed(ActionEvent e)
    {
        cardLayout.next(container);
    }
}
