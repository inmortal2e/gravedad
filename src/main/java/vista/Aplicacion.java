package vista;

import javax.swing.*;
import java.awt.*;

/**
 * Created by victor on 10/18/15.
 */
public class Aplicacion extends JFrame {

    public Aplicacion() {
        initUI();
    }

    private void initUI() {

        final EspacioPanel espacioPanel = new EspacioPanel();
        add(espacioPanel);

//        addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                Timer timer = surface.getTimer();
//                timer.stop();
//            }
//        });

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
