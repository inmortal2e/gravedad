package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor on 10/18/15.
 */
public class Objeto {

    private double masa;
    private Vector posicion;
    private Vector velocidad;
    private List<Vector> fuerzasGravitatorias;


    /*------------------------------------ Constructors ------------------------------------*/

    public Objeto(double masa, Vector posicion, Vector velocidad) {

        this.masa = masa;
        this.posicion = posicion;
        this.velocidad = velocidad;
        this.fuerzasGravitatorias = new ArrayList<>();
    }

    /*--------------------------------------------------------------------------------------*/
    /*---------------------------------- Geters and seters ---------------------------------*/

    public double getMasa() {
        return masa;
    }

    public Vector getPosicion() {
        return posicion;
    }

    public Vector getVelocidad() {
        return velocidad;
    }

    public List<Vector> getFuerzasGravitatorias() {
        return fuerzasGravitatorias;
    }

    public Vector getFuerzaGravitatoriaResultante() {

        Vector fuerzaResultante = Vector.NULO;

        for (Vector fuerza : this.fuerzasGravitatorias) {
            fuerzaResultante = fuerzaResultante.mas(fuerza);
        }

        return fuerzaResultante;
    }

    public Vector getAceleracion() {
        return getFuerzaGravitatoriaResultante().dividido(this.masa);
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------- ObservadorDelPasoDelTiempo -----------------------------*/

    public void actualizar(long milisegundosTranscurridos) {

        double tiempo = ((double) milisegundosTranscurridos) / 1000;

        this.posicion = Formulas.cinematicaEspacio(posicion, velocidad, tiempo, getAceleracion());
        this.velocidad = Formulas.cinematicaVelocidad(velocidad, getAceleracion(), tiempo);
    }

    /*--------------------------------------------------------------------------------------*/

}
