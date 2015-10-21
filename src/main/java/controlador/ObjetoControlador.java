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

    private static final int PERIODO = 5;


    public EspacioPanel inicializarElEspacio(int alto) {

        Espacio espacio = new Espacio();
//        espacio.agregarObjeto(new Objeto(new Vector(0, 0), new Vector(20, 20), Vector.NULO, 50));
        espacio.agregarObjeto(new Objeto(new Vector(0, 0), new Vector(10, 10), new Vector(0, -9.8), 50));
//        espacio.agregarObjeto(new Objeto(new Vector(0, 0), new Vector(30, 25), Vector.NULO, 50));

        Timer timer = new Timer(PERIODO, espacio);
        timer.start();

        return new EspacioPanel(espacio, alto);
    }

}
