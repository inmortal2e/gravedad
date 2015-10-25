package vista;

import javax.swing.*;

/**
 * Created by victor on 10/25/15.
 */
public class VectorPanel extends JPanel {

    public VectorPanel(String nombre) {
        super();

        JLabel labelX = new JLabel(nombre + "[X]");
        JTextField componenteX = new JTextField(5);
        JLabel labelY = new JLabel(nombre + "[Y]");
        JTextField componenteY = new JTextField(5);

        JButton botonAgregar = new JButton("Agregar");

        this.add(labelX);
        this.add(componenteX);
        this.add(labelY);
        this.add(componenteY);
        this.add(botonAgregar);
    }

}
