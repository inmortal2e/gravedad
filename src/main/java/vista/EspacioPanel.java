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
    private static final int CORRECCION_LARGO = 10;
    private static final int CORRECCION_ALTO = 32;
    private static final double ESCALA = 0.01;
    private static final double PIXELS_A_METRO = 4481.8181818;

    private Espacio espacio;
    private int alto;


    /*------------------------------------ Constructors ------------------------------------*/

    public EspacioPanel(Espacio espacio, int alto) {

        espacio.agregarObservador(this);
        this.espacio = espacio;

        this.alto = alto;
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Public methods ----------------------------------*/

    @Override
    public void cambie(Espacio espacio) {

        this.espacio = espacio;
        repaint();
    }

    /*--------------------------------------------------------------------------------------*/
    /*---------------------------------- Protected methods ---------------------------------*/

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.espacio.getObjetos().parallelStream().forEach((o) -> g.fillOval(getX(o), getY(o), DIAMETRO, DIAMETRO));
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------------- Private methods ----------------------------------*/

    private int getX(Objeto objeto) {
        return ((int) Math.round(objeto.getPosicion().getX() * PIXELS_A_METRO * ESCALA)) - CORRECCION_LARGO;
    }

    private int getY(Objeto objeto) {
        return alto - CORRECCION_ALTO - (int) Math.round(objeto.getPosicion().getY() * PIXELS_A_METRO * ESCALA);
    }

    /*--------------------------------------------------------------------------------------*/

}
