package org.ieslosremedios.daw.ud9.tareas_clase;

import java.awt.*;

public class Login {
    public static void main(String[] args) {
        Frame frame = new Frame("Login");
        frame.setBackground(Color.lightGray);
        frame.setLayout(null);
        frame.setSize(375,250);
        frame.setVisible(true);

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

        frame.add(nombre);
        frame.add(textoNombre);
        frame.add(pass);
        frame.add(textoPass);
        frame.add(cancelar);
        frame.add(acceder);

    }
}
