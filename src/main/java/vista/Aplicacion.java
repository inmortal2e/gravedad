package vista;

import controlador.ObjetoControlador;

import javax.swing.*;
import java.awt.*;

/**
 * Created by victor on 10/18/15.
 */
public class Aplicacion extends JFrame {

    public static final int VENTANA_LARGO = 1200;
    public static final int VENTANA_ALTO = 800;

    private ObjetoControlador objetoControlador;

    public Aplicacion() {

        this.objetoControlador = new ObjetoControlador();

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(objetoControlador.inicializarElEspacio(VENTANA_ALTO), BorderLayout.PAGE_START);
        panel.add(new AddObjectPanel(), BorderLayout.PAGE_END);

        getContentPane().add(panel);
        setTitle("Gravedad");
        setSize(VENTANA_LARGO, VENTANA_ALTO);
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
