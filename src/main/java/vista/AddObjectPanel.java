package vista;

import controlador.ObjetoControlador;
import modelo.Espacio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by victor on 10/25/15.
 */
public class AddObjectPanel extends JPanel implements ActionListener {

    private Espacio espacio;
    private JTextField posicionX;
    private JTextField posicionY;
    private JTextField velocidadX;
    private JTextField velocidadY;

    private ObjetoControlador objetoControlador = new ObjetoControlador();


    public AddObjectPanel(Espacio espacio) {
        super();

        this.espacio = espacio;
        
        JLabel labelPosicionX = new JLabel("Posición [X]");
        this.posicionX = new JTextField("0", 5);
        JLabel labelPosicionY = new JLabel("Posición [Y]");
        this.posicionY = new JTextField("0", 5);

        this.add(labelPosicionX);
        this.add(posicionX);
        this.add(labelPosicionY);
        this.add(posicionY);

        JLabel labelVelocidadX = new JLabel("Velocidad [X]");
        this.velocidadX = new JTextField("0", 5);
        JLabel labelVelocidadY = new JLabel("Velocidad [Y]");
        this.velocidadY = new JTextField("0", 5);

        this.add(labelVelocidadX);
        this.add(velocidadX);
        this.add(labelVelocidadY);
        this.add(velocidadY);

        JButton botonAgregar = new JButton("Agregar");
        botonAgregar.addActionListener(this);
        this.add(botonAgregar);

        this.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 2));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.objetoControlador.agregarObjeto(espacio, posicionX.getText(), posicionY.getText(), velocidadX.getText(), velocidadY.getText());
    }

}
