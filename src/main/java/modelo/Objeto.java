package modelo;

/**
 * Created by victor on 10/18/15.
 */
public class Objeto {

    private Vector posicion;
    private Vector velocidad;
    private Vector aceleracion;
    private double masa;


    /*------------------------------------ Constructors ------------------------------------*/

    public Objeto(Vector posicion, Vector velocidad, Vector aceleracion, double masa) {

        this.posicion = posicion;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.masa = masa;
    }

    /*--------------------------------------------------------------------------------------*/
    /*---------------------------------- Geters and seters ---------------------------------*/

    public Vector getPosicion() {
        return posicion;
    }

    public Vector getVelocidad() {
        return velocidad;
    }

    public Vector getAceleracion() {
        return aceleracion;
    }

    public double getMasa() {
        return masa;
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------- ObservadorDelPasoDelTiempo -----------------------------*/

    public void actualizar(long milisegundosTranscurridos) {

        double tiempo = ((double) milisegundosTranscurridos) / 1000;

        // x = x0 + v0 * t + 0.5 * a * t*t
        this.posicion = posicion.mas(velocidad.por(tiempo)).mas(this.aceleracion.por(0.5 * Math.pow(tiempo, 2)));

        // v = v0 + a * t
        this.velocidad = velocidad.mas(aceleracion.por(tiempo));
    }

    /*--------------------------------------------------------------------------------------*/

}
