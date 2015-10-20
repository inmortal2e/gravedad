package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor on 10/18/15.
 */
public class Objeto implements ObservadorDelPasoDelTiempo {

    private Vector posicion;
    private Vector velocidad;
    private Vector aceleracion;
    private double masa;

    private List<ObservadorDeObjeto> observadores;


    /*------------------------------------ Constructors ------------------------------------*/

    public Objeto(Vector posicion, Vector velocidad, Vector aceleracion, double masa) {

        this.posicion = posicion;
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.masa = masa;

        this.observadores = new ArrayList<>();
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Public methods ----------------------------------*/

    public void agregarObservador(ObservadorDeObjeto observador) {
        this.observadores.add(observador);
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------- ObservadorDelPasoDelTiempo -----------------------------*/

    @Override
    public void pasaron(long milisegundos) {

        double segundos = milisegundos / 1000;

        // v = v0 + a * t*t
        this.velocidad = this.velocidad.sumarCon(this.aceleracion.multiplicarPor(Math.pow(segundos, 2)));
        this.posicion = this.posicion.sumarCon(this.velocidad);

        this.notificarCambio();
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------------- Private methods ----------------------------------*/

    private void notificarCambio() {
        this.observadores.parallelStream().forEach((o) -> o.cambie(this));
    }

    /*--------------------------------------------------------------------------------------*/

}
