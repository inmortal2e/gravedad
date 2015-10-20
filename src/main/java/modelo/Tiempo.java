package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by vdelrio on 10/20/15.
 */
public class Tiempo extends TimerTask {

    private long periodo;
    private Timer timer;
    private List<ObservadorDelPasoDelTiempo> observadores;


    /*------------------------------------ Constructors ------------------------------------*/

    public Tiempo(long periodo) {

        this.periodo = periodo;
        this.observadores = new ArrayList<>();

        this.timer = new Timer();
        this.timer.scheduleAtFixedRate(this, 0, periodo);
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Public methods ----------------------------------*/

    public void agregarObservador(ObservadorDelPasoDelTiempo observador) {
        this.observadores.add(observador);
    }

    public void terminar() {
        // El fin de los tiempos
        this.timer.cancel();
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------- TimerTask --------------------------------------*/

    @Override
    public void run() {
        this.notificarPasoDelTiempo();
    }

    /*--------------------------------------------------------------------------------------*/
    /*----------------------------------- Private methods ----------------------------------*/

    private void notificarPasoDelTiempo() {
        this.observadores.parallelStream().forEach((o) -> o.pasaron(this.periodo));
    }

    /*--------------------------------------------------------------------------------------*/

}
