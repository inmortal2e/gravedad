package config;

/**
 * Created by vdelrio on 10/27/15.
 */
public class Configuracion {

    private static Configuracion instancia = new Configuracion();

    private Pantalla pantalla;
    private int periodo;
    private double escala;

    private Configuracion() {

        this.pantalla = Pantalla.NORMAL;
        this.periodo = 25;
        this.escala = 0.01;
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

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public double getEscala() {
        return escala;
    }

    public void setEscala(double escala) {
        this.escala = escala;
    }

}
