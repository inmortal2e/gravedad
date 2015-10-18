package vista;

import javax.swing.*;
import java.awt.*;

/**
 * Created by victor on 10/18/15.
 */
public class EspacioPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(270, 130, 20, 20);
    }
}
