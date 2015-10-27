package vista;

import config.Configuracion;
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

    // TODO revisar el tema de las correcciones
    private static final int CORRECCION_LARGO = 10;
    private static final int CORRECCION_ALTO = 32;

    private Espacio espacio;


    /*------------------------------------ Constructors ------------------------------------*/

    public EspacioPanel(Espacio espacio) {

        espacio.agregarObservador(this);
        this.espacio = espacio;

        Configuracion conf = Configuracion.getInstancia();

        this.setPreferredSize(new Dimension(conf.getPantalla().getLargoPanel(), conf.getPantalla().getAltoPanel()));
        this.setBackground(Color.WHITE);
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
        Configuracion conf = Configuracion.getInstancia();
        return ((int) Math.round(objeto.getPosicion().getX() * conf.getPantalla().getPixelsAMetros() * conf.getEscala())) - CORRECCION_LARGO;
    }

    private int getY(Objeto objeto) {
        Configuracion conf = Configuracion.getInstancia();
        return conf.getPantalla().getAltoPanel() - CORRECCION_ALTO - (int) Math.round(objeto.getPosicion().getY() * conf.getPantalla().getPixelsAMetros() * conf.getEscala());
    }

    /*--------------------------------------------------------------------------------------*/

}
