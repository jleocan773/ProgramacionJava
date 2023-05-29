package org.ieslosremedios.daw.ud9.practica;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import static org.ieslosremedios.daw.ud8.practica.completa.OperacionesApp.*;


public class InterfazGrafica {
    List listaEstudiantes;
    JFrame ventanaPrincipal;
    JFrame ventanaImportarXML;
    JFrame ventanaExportarXML;
    JFrame ventanaSeleccionarAlumnoMenosParticipativo;


    public static void main(String[] args) {
        new InterfazGrafica();
    }

    InterfazGrafica() {

        ventanaPrincipal = new JFrame("Remedy Softworks | Práctica 8 y 9");
        ventanaPrincipal.setBackground(Color.lightGray);
        ventanaPrincipal.setLayout(null);
        ventanaPrincipal.setSize(500, 500);
        ventanaPrincipal.setVisible(true);
        ventanaPrincipal.setLayout(new GridLayout(4,2, 5, 5));

        MenuBar menuBar = new MenuBar();
        Menu menuArchivo = new Menu("Archivo");
        MenuItem cargarLista = new MenuItem("Asignar Lista");
        MenuItem cargarXML = new MenuItem("Cargar XML");
        MenuItem cargarCVS = new MenuItem("Cargar CVS");

        menuArchivo.add(cargarLista);
        menuArchivo.add(cargarXML);
        menuArchivo.add(cargarCVS);
        menuBar.add(menuArchivo);
        ventanaPrincipal.setMenuBar(menuBar);

        //Para la opción "Cargar Lista"
        cargarLista.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Mostrar un cuadro de diálogo de entrada de texto
                String rutaLista = JOptionPane.showInputDialog(ventanaPrincipal, "Introduce la ruta del XML para cargar la lista:");

                //Verificar si el usuario ha ingresado un texto
                if (!rutaLista.isEmpty()) {
                    listaEstudiantes = (List) pasarXML_A_Lista(rutaLista);
                }
            }
        });

        //Para la opción "Cargar XML"
        cargarXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(ventanaPrincipal);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                }
            }
        });

        //Para la opción "Cargar CVS"
        cargarCVS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showOpenDialog(ventanaPrincipal);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();

                }
            }
        });


        JButton importarXML = new JButton("Importar XML");
        JButton exportarXML = new JButton("Exportar XML");
        JButton seleccionarAlumnoMenosParticipativo = new JButton("<html>Seleccionar alumno <br> menos participativo</html>");
        JButton resetearParticipaciones = new JButton("<html> Resetear <br> participaciones</html>");
        JButton alumnosMásYMenosParticipativos = new JButton("<html>Alumnos más y menos <br> participativos</html>");
        JButton alumnosPorDebajoMedia = new JButton("<html>Alumnos con participación <br> por debajo de la media</html>");
        JButton alumnosConParticipaciónIndicada = new JButton("<html>Alumnos con <br> participación indicada</html>");
        JButton ultimoAlumnoEnParticipar = new JButton("<html>Último alumno en <br> participar</html>");
        JButton mostrarInformaciónAlumno = new JButton("<html>Mostrar información <br> alumno</html>");
        JButton gestionarAlumnos = new JButton("Gestionar alumnos");
        JButton salir= new JButton("Salir");

        ventanaPrincipal.add(importarXML);
        ventanaPrincipal.add(exportarXML);
        ventanaPrincipal.add(seleccionarAlumnoMenosParticipativo);
        ventanaPrincipal.add(resetearParticipaciones);
        ventanaPrincipal.add(alumnosMásYMenosParticipativos);
        ventanaPrincipal.add(alumnosPorDebajoMedia);
        ventanaPrincipal.add(alumnosConParticipaciónIndicada);
        ventanaPrincipal.add(ultimoAlumnoEnParticipar);
        ventanaPrincipal.add(mostrarInformaciónAlumno);
        ventanaPrincipal.add(gestionarAlumnos);
        ventanaPrincipal.add(salir);

        //Para cerrar la ventana principal
        ventanaPrincipal.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaPrincipal.dispose();
            }
        });


        ventanaImportarXML = new JFrame("Importar XML ");
        ventanaImportarXML.setBackground(Color.lightGray);
        ventanaImportarXML.setLayout(null);
        ventanaImportarXML.setSize(600, 200);
        ventanaImportarXML.setVisible(false);


        //Crear el mensaje de texto
        JLabel mensajeImportar = new JLabel("Introduce la lista de alumnos que quieres importar y la ruta donde quieres importar el archivo");
        mensajeImportar.setBounds(20, 20, 600, 30);
        ventanaImportarXML.add(mensajeImportar);

        //Crear el cuadro de texto para la lista
        JLabel etiquetaListaImportar = new JLabel("Lista:");
        etiquetaListaImportar.setBounds(20, 60, 60, 20);
        ventanaImportarXML.add(etiquetaListaImportar);

        JTextField campoListaImportar = new JTextField();
        campoListaImportar.setBounds(120, 60, 275, 20);
        ventanaImportarXML.add(campoListaImportar);

        //Crear el cuadro de texto para la ruta
        JLabel etiquetaRutaImportar = new JLabel("Ruta:");
        etiquetaRutaImportar.setBounds(20, 90, 60, 20);
        ventanaImportarXML.add(etiquetaRutaImportar);

        JTextField campoRutaImportar = new JTextField();
        campoRutaImportar.setBounds(120, 90, 275, 20);
        ventanaImportarXML.add(campoRutaImportar);

        //Crear el botón "EjecutarImportar"
        JButton botonEjecutarImportar = new JButton("Ejecutar");
        botonEjecutarImportar.setBounds(100, 120, 325, 30);

        ventanaImportarXML.add(botonEjecutarImportar);

        // Crear el botón "Volver"
        JButton botonVolverImportar = new JButton("Volver");
        botonVolverImportar.setBounds(460, 120, 100, 30);

        //Al hacer clic en el botón volver
        botonVolverImportar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón "Volver"
                ventanaPrincipal.setVisible(true);
                ventanaImportarXML.setVisible(false);

            }
        });

        ventanaImportarXML.add(botonVolverImportar);


        //Al hacer clic en el botón "EjecutarImportar"
        botonEjecutarImportar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón "Ejecutar"
                String lista = campoListaImportar.getText();
                String ruta = campoRutaImportar.getText();
                JOptionPane.showMessageDialog(ventanaImportarXML, "Importado con éxito");

                // Esto está comentado porque habría que cambiar el código para generar la lista con la ruta del xml que ya tienes, pero la base es la misma
                // Se meten como parámetros los valores recibidos en el getText
                // importarXML(lista, ruta);
            }
        });

        //Para cerrar la ventana Importar
        ventanaImportarXML.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaImportarXML.dispose();
            }
        });


        //Al hacer clic en el botón "importarXML"
        importarXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.setVisible(false);
                ventanaImportarXML.setVisible(true);
            }
        });


        ventanaExportarXML = new JFrame("Exportar XML ");
        ventanaExportarXML.setBackground(Color.lightGray);
        ventanaExportarXML.setLayout(null);
        ventanaExportarXML.setSize(600, 200);
        ventanaExportarXML.setVisible(false);


        //Crear el botón "Volver"
        JButton botonVolverExportar = new JButton("Volver");
        botonVolverExportar.setBounds(460, 120, 100, 30);

        //Al hacer clic en el botón volver
        botonVolverExportar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón "Volver"
                ventanaPrincipal.setVisible(true);
                ventanaExportarXML.setVisible(false);

            }
        });

        ventanaExportarXML.add(botonVolverExportar);


        //Crear el mensaje de texto
        JLabel mensajeExportar = new JLabel("Introduce la lista de alumnos que quieres importar y la ruta donde quieres importar el archivo");
        mensajeExportar.setBounds(20, 20, 600, 30);
        ventanaExportarXML.add(mensajeExportar);

        //Crear el cuadro de texto para la lista
        JLabel etiquetaListaExportar = new JLabel("Lista:");
        etiquetaListaExportar.setBounds(20, 60, 60, 20);
        ventanaExportarXML.add(etiquetaListaExportar);

        JTextField campoListaExportar = new JTextField();
        campoListaExportar.setBounds(120, 60, 275, 20);
        ventanaExportarXML.add(campoListaExportar);

        //Crear el cuadro de texto para la ruta
        JLabel etiquetaRutaExportar = new JLabel("Ruta:");
        etiquetaRutaExportar.setBounds(20, 90, 60, 20);
        ventanaExportarXML.add(etiquetaRutaExportar);

        JTextField campoRutaExportar = new JTextField();
        campoRutaExportar.setBounds(120, 90, 275, 20);
        ventanaExportarXML.add(campoRutaExportar);

        //Crear el botón "EjecutarExportar"
        JButton botonEjecutarExportar = new JButton("Ejecutar");
        botonEjecutarExportar.setBounds(100, 120, 325, 30);
        ventanaExportarXML.add(botonEjecutarExportar);

        //Al hacer clic en el botón "EjecutarExportar"
        botonEjecutarExportar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón "Ejecutar"
                String rutaLectura = campoListaExportar.getText();
                String rutaEscritura = campoRutaExportar.getText();
                JOptionPane.showMessageDialog(ventanaImportarXML, "Copia de seguridad realizada con éxito");

                // Se meten como parámetros los valores recibidos en el getText
                exportarXML(rutaLectura, rutaEscritura);
            }
        });


        //Para cerrar la ventana Exportar
        ventanaExportarXML.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaExportarXML.dispose();
            }
        });


        //Al hacer clic en el botón "exportarXML"
        exportarXML.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.setVisible(false);
                ventanaExportarXML.setVisible(true);
            }
        });

        ventanaSeleccionarAlumnoMenosParticipativo = new JFrame("Seleccionar Alumno Menos Participativo ");
        ventanaSeleccionarAlumnoMenosParticipativo.setBackground(Color.lightGray);
        ventanaSeleccionarAlumnoMenosParticipativo.setLayout(null);
        ventanaSeleccionarAlumnoMenosParticipativo.setSize(600, 200);
        ventanaSeleccionarAlumnoMenosParticipativo.setVisible(false);


        //Crear el botón "Volver"
        JButton botonVolverSeleccionarAlumnoMenosParticipativo = new JButton("Volver");
        botonVolverSeleccionarAlumnoMenosParticipativo.setBounds(460, 120, 100, 30);

        //Al hacer clic en el botón volver
        botonVolverSeleccionarAlumnoMenosParticipativo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic en el botón "Volver"
                ventanaPrincipal.setVisible(true);
                ventanaSeleccionarAlumnoMenosParticipativo.setVisible(false);

            }
        });

        ventanaSeleccionarAlumnoMenosParticipativo.add(botonVolverSeleccionarAlumnoMenosParticipativo);

        //Para cerrar la ventana SeleccionarAlumnoMenosParticipativo
        ventanaExportarXML.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventanaExportarXML.dispose();
            }
        });


        //Al hacer clic en el botón "SeleccionarAlumnoMenosParticipativo"
        seleccionarAlumnoMenosParticipativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.setVisible(false);
                ventanaSeleccionarAlumnoMenosParticipativo.setVisible(true);
            }
        });

        //Crear el mensaje de texto
        JLabel mensajeSeleccionarAlumnoMenosParticipativo = new JLabel("Introduce la lista de alumnos para seleccionar al alumno menos participativo");
        mensajeExportar.setBounds(20, 20, 600, 30);
        ventanaSeleccionarAlumnoMenosParticipativo.add(mensajeSeleccionarAlumnoMenosParticipativo);

        //Crear el cuadro de texto para la lista
        JLabel etiquetaSeleccionarAlumnoMenosParticipativo = new JLabel("Ruta XML:");
        etiquetaSeleccionarAlumnoMenosParticipativo.setBounds(20, 60, 60, 20);
        ventanaSeleccionarAlumnoMenosParticipativo.add(etiquetaSeleccionarAlumnoMenosParticipativo);

        JTextField textoSeleccionarAlumnoMenosParticipativo = new JTextField();
        textoSeleccionarAlumnoMenosParticipativo.setBounds(120, 60, 275, 20);
        ventanaSeleccionarAlumnoMenosParticipativo.add(textoSeleccionarAlumnoMenosParticipativo);


        //Crear el botón "EjecutarSeleccionarAlumnoMenosParticipativo"
        JButton botonEjecutarSeleccionarAlumnoMenosParticipativo = new JButton("Ejecutar");
        botonEjecutarSeleccionarAlumnoMenosParticipativo.setBounds(100, 120, 325, 30);
        ventanaSeleccionarAlumnoMenosParticipativo.add(botonEjecutarSeleccionarAlumnoMenosParticipativo);

        //Al hacer clic en el botón "EjecutarSeleccionarAlumnoMenosParticipativo"
        botonEjecutarSeleccionarAlumnoMenosParticipativo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rutaLectura = textoSeleccionarAlumnoMenosParticipativo.getText();
                seleccionarAlumnoMenosParticipativo(rutaLectura);
            }
        });


        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaPrincipal.dispose();
            }
        });



    }


}
