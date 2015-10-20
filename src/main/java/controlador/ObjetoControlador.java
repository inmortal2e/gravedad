package controlador;

import modelo.Espacio;
import modelo.Objeto;
import modelo.Tiempo;
import modelo.Vector;
import vista.EspacioPanel;

/**
 * Created by vdelrio on 10/20/15.
 */
public class ObjetoControlador {

    private static final long PERIODO = 10;

    public EspacioPanel inicializarElEspacio(int alto) {

        Espacio espacio = new Espacio();
        espacio.agregarObjeto(new Objeto(new Vector(5, 5), new Vector(1, 1), Vector.NULO, 50));
        espacio.agregarObjeto(new Objeto(new Vector(17, 3), new Vector(2, 1), Vector.NULO, 50));

        Tiempo tiempo = new Tiempo(PERIODO);
        tiempo.agregarObservador(espacio);

        return new EspacioPanel(espacio, alto);
    }

}
