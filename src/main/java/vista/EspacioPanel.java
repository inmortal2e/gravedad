package vista;

import modelo.Espacio;
import modelo.Objeto;
import modelo.ObservadorDelEspacio;

import javax.swing.*;
import java.awt.*;


/**
 * Created by victor on 10/18/15.
 */
public class EspacioPanel extends JPanel implements ObservadorDelEspacio {

    private static final int DIAMETRO = 20;
    private Espacio espacio;
    private int alto;


    public EspacioPanel(Espacio espacio, int alto) {

        espacio.agregarObservador(this);
        this.espacio = espacio;
        
        this.alto = alto;
    }

    @Override
    public void cambie(Espacio espacio) {

        this.espacio = espacio;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        this.espacio.getObjetos().parallelStream().forEach((o) -> g.fillOval(getX(o), getY(o), DIAMETRO, DIAMETRO));

        for (Objeto objeto : this.espacio.getObjetos()) {
            g.fillOval(getX(objeto), getY(objeto), DIAMETRO, DIAMETRO);
        }

    }

    private int getX(Objeto objeto) {
        return (int) Math.round(objeto.getPosicion().getX());
    }

    private int getY(Objeto objeto) {
        return alto - (int) Math.round(objeto.getPosicion().getY());
    }

}
