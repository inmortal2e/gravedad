package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by vdelrio on 10/20/15.
 */
public class Tiempo extends TimerTask {

    private Timer timer = new Timer();
    private long periodo;
    private List<ObservadorDelPasoDelTiempo> observadores = new ArrayList<>();


    public Tiempo(long periodo) {
        this.periodo = periodo;
        this.timer.scheduleAtFixedRate(this, 0, periodo);
    }

    public void agregarObservador(ObservadorDelPasoDelTiempo observador) {
        this.observadores.add(observador);
    }

    public void terminar() {
        this.timer.cancel();
    }

    @Override
    public void run() {
        this.notificarPasoDelTiempo();
    }

    private void notificarPasoDelTiempo() {
        this.observadores.parallelStream().forEach((o) -> o.pasaron(this.periodo));
    }

}
