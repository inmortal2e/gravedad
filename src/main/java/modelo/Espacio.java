package modelo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vdelrio on 10/20/15.
 */
public class Espacio implements ActionListener {

    public static final double G = 6.67300E-11;

    private List<Objeto> objetos;
    private List<ObservadorDelEspacio> observadores;


    /*------------------------------------ Constructors ------------------------------------*/

    public Espacio() {
        this.objetos = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Public methods ----------------------------------*/

    @Override
    public void actionPerformed(ActionEvent e) {

        int periodo = ((Timer) e.getSource()).getDelay();

        for (Objeto objeto: this.objetos) {

//            actualizarFuerzasGravitatorias(objeto);
            objeto.actualizar(periodo);
        }

        this.notificarCambio();
    }

    public void agregarObjeto(Objeto objeto) {
        this.objetos.add(objeto);
    }

    public void agregarObservador(ObservadorDelEspacio observador) {
        this.observadores.add(observador);
    }

    /*--------------------------------------------------------------------------------------*/
    /*---------------------------------- Geters and seters ---------------------------------*/

    public List<Objeto> getObjetos() {
        return objetos;
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------------- Private methods ----------------------------------*/

    private void actualizarFuerzasGravitatorias(Objeto objeto2) {

        objeto2.getFuerzasGravitatorias().clear();

        for (Objeto objeto1 : this.objetos) {

            if (!objeto2.equals(objeto1)) {

                // Ley de gravitación universal (forma vectorial)
                // TODO pasar a una clase que contenga formulas

                double cte = (-1) * G * objeto1.getMasa() * objeto2.getMasa() / Math.pow(objeto2.getPosicion().menos(objeto1.getPosicion()).modulo(), 3);
                objeto2.getFuerzasGravitatorias().add(objeto2.getPosicion().menos(objeto1.getPosicion()).por(cte));
            }
        }
    }

    private void notificarCambio() {

        for (ObservadorDelEspacio observador : this.observadores) {
            observador.cambie(this);
        }
    }

    /*--------------------------------------------------------------------------------------*/

}
