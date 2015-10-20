package vista;

import modelo.Objeto;
import modelo.Vector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by victor on 10/18/15.
 */
public class Aplicacion extends JFrame {

    private static final int DELAY = 150;
    private Timer timer;

    public Aplicacion() {
        initUI();
    }

    private void initUI() {

        timer = new Timer(DELAY, null);
        timer.addActionListener(new Objeto(new Vector(5, 5), new Vector(1, 1), Vector.NULO, 50));

        final EspacioPanel espacioPanel = new EspacioPanel();
        add(espacioPanel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                timer.stop();
            }
        });

        setTitle("Gravedad");
        setSize(700, 500);
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
