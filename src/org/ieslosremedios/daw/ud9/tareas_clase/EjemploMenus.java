package org.ieslosremedios.daw.ud9.tareas_clase;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import static org.ieslosremedios.daw.ud8.practica.completa.OperacionesApp.pasarXML_A_Lista;

public class EjemploMenus {

        public static void main(String[] args) {
            Frame f= new Frame("Menu and MenuItem Example");

            MenuBar menuBar = new MenuBar();
            Menu menuArchivo = new Menu("Archivo");
            Menu menuEditar = new Menu("Editar");
            MenuItem introducirTexto = new MenuItem("Escribe texto...");
            MenuItem abrirFichero = new MenuItem("Abre un fichero");

            menuArchivo.add(introducirTexto);
            menuArchivo.add(abrirFichero);
            Menu submenu=new Menu("Sub Menu");
            Menu paraSubmenu1 = new Menu("Sub Menu 1");
            Menu paraSubmenu2 = new Menu("Sub Menu 2");

            menuBar.add(menuArchivo);
            menuBar.add(menuEditar);
            menuEditar.add(submenu);
            submenu.add(paraSubmenu1);
            submenu.add(paraSubmenu2);


            //Para la opción "Cargar Lista"
            introducirTexto.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //Mostrar un cuadro de diálogo de entrada de texto
                    String texto = JOptionPane.showInputDialog(f, "Introduce un texto:");

                    //Verificar si el usuario ha ingresado un texto
                    if (!texto.isEmpty()) {
                        System.out.println(texto);;
                    }
                }
            });

            //Para la opción "abrirFichero"
            abrirFichero.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JFileChooser fileChooser = new JFileChooser();
                    int result = fileChooser.showOpenDialog(f);
                    if (result == JFileChooser.APPROVE_OPTION) {
                        File file = fileChooser.getSelectedFile();

                    }
                }
            });


            f.setMenuBar(menuBar);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
        }
}

