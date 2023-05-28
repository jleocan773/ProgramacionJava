package org.ieslosremedios.daw.ud9.tareas_clase;

import java.awt.*;

public class EjemploMenus {

        public static void main(String[] args) {
            Frame f= new Frame("Menu and MenuItem Example");

            MenuBar mb=new MenuBar();

            Menu menuFile=new Menu("File");
            Menu menuEdit=new Menu("Edit");

            Menu submenu=new Menu("Sub Menu");
            MenuItem i1=new MenuItem("Item 1");
            MenuItem i2=new MenuItem("Item 2");
            MenuItem i3=new MenuItem("Item 3");
            MenuItem i4=new MenuItem("Item 4");
            MenuItem i5=new MenuItem("Item 5");
            menuFile.add(i1);
            menuFile.add(i2);
            menuFile.add(i3);
            submenu.add(i4);
            submenu.add(i5);
            menuFile.add(submenu);
            mb.add(menuFile);
            mb.add(menuEdit);
            f.setMenuBar(mb);
            f.setSize(400,400);
            f.setLayout(null);
            f.setVisible(true);
        }
}

