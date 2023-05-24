package org.ieslosremedios.daw.ud9.ejercicios;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ejercicio9_2{
    Frame ventanaPrincipal;
    Frame loginCorrecto;

    public static void main(String[] args) {
        new Ejercicio9_2();
    }

    Ejercicio9_2() {
        ventanaPrincipal = new Frame("Login 9.2");
        ventanaPrincipal.setBackground(Color.lightGray);
        ventanaPrincipal.setLayout(null);
        ventanaPrincipal.setSize(375,250);
        ventanaPrincipal.setVisible(true);

        loginCorrecto = new Frame("Log Correcto ");
        loginCorrecto.setBackground(Color.lightGray);
        loginCorrecto.setLayout(null);
        loginCorrecto.setSize(375,250);
        loginCorrecto.setVisible(false);

        Label avisoLogin = new Label("Te has conectado correctamente");
        avisoLogin.setBounds(100,100,250,50);
        loginCorrecto.add(avisoLogin);


        Label nombre = new Label("Usuario");
        nombre.setBounds(25,65,70,25);
        TextField textoNombre = new TextField("");
        textoNombre.setBounds(125,65,200,25);

        Label pass = new Label("Password");
        pass.setBounds(25,115,70,25);
        TextField textoPass = new TextField("");
        textoPass.setBounds(125,115,200,25);

        Button cancelar = new Button("Cancelar");
        cancelar.setBounds(50,175,100,25);

        Button acceder = new Button("Acceder");
        acceder.setBounds(225,175,100,25);

        ventanaPrincipal.add(nombre);
        ventanaPrincipal.add(textoNombre);
        ventanaPrincipal.add(pass);
        ventanaPrincipal.add(textoPass);
        ventanaPrincipal.add(cancelar);
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

        //El texto cancelar borra el texto introducido
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textoNombre.setText("");
                textoPass.setText("");
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
