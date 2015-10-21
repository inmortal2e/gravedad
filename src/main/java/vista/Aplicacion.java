package vista;

import controlador.ObjetoControlador;

import javax.swing.*;
import java.awt.*;

/**
 * Created by victor on 10/18/15.
 */
public class Aplicacion extends JFrame {

    private static final int LARGO = 700;
    private static final int ALTO = 500;

    private ObjetoControlador objetoControlador;

    public Aplicacion() {

        this.objetoControlador = new ObjetoControlador();

        add(objetoControlador.inicializarElEspacio(ALTO));

        setTitle("Gravedad");
        setSize(LARGO, ALTO);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Aplicacion aplicacion = new Aplicacion();
            aplicacion.setVisible(true);
        });
    }

}
