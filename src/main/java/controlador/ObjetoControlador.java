package controlador;

import modelo.Espacio;
import modelo.Objeto;
import modelo.Vector;

/**
 * Created by vdelrio on 10/20/15.
 */
public class ObjetoControlador {


    public void agregarObjeto(Espacio espacio, String posicionX, String posicionY, String velocidadX, String velocidadY) {
        // TODO validaciones
        espacio.agregarObjeto(new Objeto(1, new Vector(Double.valueOf(posicionX), Double.valueOf(posicionY)), new Vector(Double.valueOf(velocidadX), Double.valueOf(velocidadY))));
    }

}
