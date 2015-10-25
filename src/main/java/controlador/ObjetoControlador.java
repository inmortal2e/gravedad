package controlador;

import modelo.Espacio;
import modelo.Objeto;
import modelo.Vector;
import vista.EspacioPanel;

import javax.swing.*;
import java.util.Random;

/**
 * Created by vdelrio on 10/20/15.
 */
public class ObjetoControlador {

    private static final int PERIODO = 5;
    private Random random = new Random();


    public EspacioPanel inicializarElEspacio(int alto) {

        Espacio espacio = new Espacio();

        for (int i = 0; i < 5; i++) {
            espacio.agregarObjeto(new Objeto(5.976e+9, posicionRandom(), velocidadRandom()));
        }

        espacio.agregarObjeto(new Objeto(9.976e+11, new Vector(30, 30), new Vector(-0.5, -0.5)));
        espacio.agregarObjeto(new Objeto(5.976e+10, new Vector(35, 25), new Vector(1, 1)));
        espacio.agregarObjeto(new Objeto(5.976e+10, new Vector(25, 25), new Vector(3, -0.5)));
        espacio.agregarObjeto(new Objeto(5.976e+9, new Vector(10, 10), new Vector(1, 2)));

        Timer timer = new Timer(PERIODO, espacio);
        timer.start();

        return new EspacioPanel(espacio, alto);
    }

    private Vector posicionRandom() {
        return new Vector(70 * random.nextDouble(), 30 * random.nextDouble());
    }

    private Vector velocidadRandom() {
        return new Vector(2 * random.nextDouble(), 2 * random.nextDouble());
    }

}
