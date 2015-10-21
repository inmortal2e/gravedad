package modelo;

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

//    @Override
//    public void pasaron(long milisegundos) {
//
//        // TODO: ver si conviene pasar a parallelStream
//        for (Objeto objeto: this.objetos) {
//            objeto.actualizar(milisegundos);
//        }
//
//        this.notificarCambio();
//    }

    private void notificarCambio() {

        for (ObservadorDelEspacio observador : this.observadores) {
            observador.cambie(this);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (Objeto objeto: this.objetos) {
            objeto.actualizar(1);
        }

        this.notificarCambio();
    }
}
