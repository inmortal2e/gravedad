package config;

/**
 * Created by vdelrio on 10/27/15.
 */
public class Configuracion {

    private static Configuracion instancia = new Configuracion();

    private Pantalla pantalla;
    private double escala;

    private Configuracion() {

        this.pantalla = Pantalla.RETINA;
        this.escala = 0.005;
    }

    public static Configuracion getInstancia() {
        return instancia;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public double getEscala() {
        return escala;
    }

    public void setEscala(double escala) {
        this.escala = escala;
    }

}
