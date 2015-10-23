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

            actualizarFuerzasGravitatorias(objeto);
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

    private void actualizarFuerzasGravitatorias(Objeto objeto1) {

        objeto1.getFuerzasGravitatorias().clear();

        for (Objeto objeto2 : this.objetos) {

            if (!objeto1.equals(objeto2)) {
                objeto1.getFuerzasGravitatorias().add(Formulas.gravitacionUniversal(objeto2, objeto1));
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
