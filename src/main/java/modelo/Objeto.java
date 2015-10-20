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

        double segundos = milisegundosTranscurridos / 1000;

        // v = v0 + a * t*t
        this.velocidad = this.velocidad.sumarCon(this.aceleracion.multiplicarPor(Math.pow(segundos, 2)));
        this.posicion = this.posicion.sumarCon(this.velocidad.multiplicarPor(segundos));
    }

    /*--------------------------------------------------------------------------------------*/

}
