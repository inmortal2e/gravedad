package modelo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by victor on 10/18/15.
 */
public class Objeto implements ActionListener {

    private Vector posicion;
    private Vector velocidad;
    private Vector aceleracion;
    private double masa;


    public Objeto(Vector posicion, Vector velocidad, Vector aceleracion, double masa) {
        this.posicion = posicion;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.masa = masa;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // TODO aca necesitamos saber cuanto tiempo paso desde la última llamada del timer (por ahora suponemos 1 seg)
        double tiempo = 1;

        // v = v0 + a * t*t
        this.velocidad = this.velocidad.sumarCon(this.aceleracion.multiplicarPor(Math.pow(tiempo, 2)));
        this.posicion = this.posicion.sumarCon(this.velocidad);
    }
}
