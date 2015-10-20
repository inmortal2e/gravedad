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

    private static final long PERIODO = 1;

    public EspacioPanel inicializarElEspacio(int alto) {

        Espacio espacio = new Espacio();
//        espacio.agregarObjeto(new Objeto(new Vector(0, 0), new Vector(1, 1), Vector.NULO, 50));
        espacio.agregarObjeto(new Objeto(new Vector(50, 50), new Vector(100, 100), new Vector(0, -40), 50));
//        espacio.agregarObjeto(new Objeto(new Vector(170, 30), new Vector(2, 1), Vector.NULO, 50));

        Tiempo tiempo = new Tiempo(PERIODO);
        tiempo.agregarObservador(espacio);

        return new EspacioPanel(espacio, alto);
    }

}
