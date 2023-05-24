package org.ieslosremedios.daw.ud9.ejemplos;

import org.ieslosremedios.daw.ud9.listeners.MiListener;

import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MiComponenteAWT extends Frame{
    Button botonsalir;

    public static void main(String[] args) {

        new MiComponenteAWT();
    }

    MiComponenteAWT(){
        setTitle("Mi Componente");
        setVisible(true);
        setLayout(null);
        setBounds(200,200,400,400);

        botonsalir = new Button("Salir");
        botonsalir.setBounds(50, 50, 50, 50);
        add(botonsalir);

        //Este Listener está en otra clase que hemos creado
        //botonsalir.addActionListener(new MiListener(this));

        //Este Listener es el que hemos creado debajo
        //botonsalir.addActionListener(this);

        //La mejor manera y la más común de hacer un Listener es esta
        botonsalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                botonsalir.setLabel("Miau");
            }
        });

        //Creamos un Listener para cuando se interactúe con la ventana
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MiComponenteAWT.this.dispose();
            }
        });



    }

//    //Así se haría el listener en la misma clase
//    @Override
//    public void actionPerformed(ActionEvent e){
//        ((Frame) botonsalir.getParent()).dispose();
//    }

}
