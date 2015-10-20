package modelo;

/**
 * Created by vdelrio on 10/20/15.
 */
@FunctionalInterface
public interface ObservadorDelPasoDelTiempo {

    void pasaron(long milisegundos);

}
