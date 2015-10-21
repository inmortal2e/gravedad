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


    public Espacio() {
        this.objetos = new ArrayList<>();
        this.observadores = new ArrayList<>();
    }

    public void agregarObjeto(Objeto objeto) {
        this.objetos.add(objeto);
    }

    public void agregarObservador(ObservadorDelEspacio observador) {
        this.observadores.add(observador);
    }

    public List<Objeto> getObjetos() {
        return objetos;
    }

    private void notificarCambio() {

        for (ObservadorDelEspacio observador : this.observadores) {
            observador.cambie(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int periodo = ((Timer) e.getSource()).getDelay();

        for (Objeto objeto: this.objetos) {
            objeto.actualizar(periodo);
        }

        this.notificarCambio();
    }
}
