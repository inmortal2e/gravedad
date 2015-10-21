package controlador;

import modelo.Espacio;
import modelo.Objeto;
import modelo.Vector;
import vista.EspacioPanel;

import javax.swing.*;

/**
 * Created by vdelrio on 10/20/15.
 */
public class ObjetoControlador {

    private static final long PERIODO = 1;


    public EspacioPanel inicializarElEspacio(int alto) {

        Espacio espacio = new Espacio();
        espacio.agregarObjeto(new Objeto(new Vector(0, 0), new Vector(300, 200), Vector.NULO, 50));
        espacio.agregarObjeto(new Objeto(new Vector(0, 0), new Vector(1000, 1000), new Vector(0, -4000), 50));
        espacio.agregarObjeto(new Objeto(new Vector(170, 30), new Vector(600, 150), Vector.NULO, 50));

        Timer timer = new Timer(5, espacio);
        timer.start();

//        Tiempo tiempo = new Tiempo(PERIODO);
//        tiempo.agregarObservador(espacio);

        return new EspacioPanel(espacio, alto);
    }

}
