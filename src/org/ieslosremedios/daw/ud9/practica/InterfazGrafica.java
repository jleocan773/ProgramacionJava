package org.ieslosremedios.daw.ud9.practica;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InterfazGrafica {

    Frame ventanaPrincipal;
    Frame loginCorrecto;

    public static void main(String[] args) {
        new InterfazGrafica();
    }

    InterfazGrafica() {

        ventanaPrincipal = new Frame("Login 9.2");
        ventanaPrincipal.setBackground(Color.lightGray);
        ventanaPrincipal.setLayout(null);
        ventanaPrincipal.setSize(375, 250);
        ventanaPrincipal.setVisible(true);

        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        MenuItem cargarXML = new MenuItem("Cargar XML");
        MenuItem cargarCVS = new MenuItem("Cargar CVS");

        menuArchivo.add(cargarXML);
        menuArchivo.add(cargarCVS);
        menuBar.add(menuArchivo);
        ventanaPrincipal.setMenuBar(menuBar);

        loginCorrecto = new Frame("Log Correcto ");
        loginCorrecto.setBackground(Color.lightGray);
        loginCorrecto.setLayout(null);
        loginCorrecto.setSize(375, 250);
        loginCorrecto.setVisible(false);

        Label avisoLogin = new Label("Te has conectado correctamente");
        avisoLogin.setBounds(100, 100, 250, 50);
        loginCorrecto.add(avisoLogin);

        Button importarXML = new Button("importarXML");
        importarXML.setBounds(50, 175, 100, 25);

        Button acceder = new Button("Acceder");
        acceder.setBounds(225, 175, 100, 25);

        ventanaPrincipal.add(importarXML);
        ventanaPrincipal.add(acceder);

        //Para cerrar la ventana principal
        ventanaPrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaPrincipal.dispose();
            }
        });

        //Para cerrar la ventana de login
        loginCorrecto.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                loginCorrecto.dispose();
            }
        });


        importarXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        //El texto Aceptar muestra un diálogo modal
        acceder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.setVisible(false);
                loginCorrecto.setVisible(true);
            }
        });


    }
}