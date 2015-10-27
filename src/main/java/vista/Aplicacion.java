package vista;

import config.Configuracion;
import modelo.Espacio;

import javax.swing.*;
import java.awt.*;

/**
 * Created by victor on 10/18/15.
 */
public class Aplicacion extends JFrame {


    public Aplicacion() {

        Espacio espacio = new Espacio();
        Timer timer = new Timer(Configuracion.getInstancia().getPantalla().getPeriodo(), espacio);
        timer.start();

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new EspacioPanel(espacio), BorderLayout.CENTER);
        panel.add(new AddObjectPanel(espacio), BorderLayout.PAGE_END);

        getContentPane().add(panel);
        setTitle("Gravedad");
        setLocationRelativeTo(null);
        setResizable(false);

        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            Aplicacion aplicacion = new Aplicacion();
            aplicacion.setVisible(true);
        });
    }

}
