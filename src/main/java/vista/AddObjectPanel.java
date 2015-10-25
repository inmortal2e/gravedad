package vista;

import javax.swing.*;

/**
 * Created by victor on 10/25/15.
 */
public class AddObjectPanel extends JPanel {

    public AddObjectPanel() {
        super();

        JLabel labelPosicionX = new JLabel("Posición [X]");
        JTextField posicionX = new JTextField(5);
        JLabel labelPosicionY = new JLabel("Posición [Y]");
        JTextField posicionY = new JTextField(5);

        this.add(labelPosicionX);
        this.add(posicionX);
        this.add(labelPosicionY);
        this.add(posicionY);

        JLabel labelVelocidadX = new JLabel("Velocidad [X]");
        JTextField velocidadX = new JTextField(5);
        JLabel labelVelocidadY = new JLabel("Velocidad [Y]");
        JTextField velocidadY = new JTextField(5);

        this.add(labelVelocidadX);
        this.add(velocidadX);
        this.add(labelVelocidadY);
        this.add(velocidadY);

        JButton botonAgregar = new JButton("Agregar");
        this.add(botonAgregar);
    }

}
