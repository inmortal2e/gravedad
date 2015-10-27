package config;

/**
 * Created by vdelrio on 10/27/15.
 */
public enum Pantalla {

    // TODO setear bien el alto y largo del panel y el pixels a metros de NORMAL
    NORMAL(800, 600, 5, 4481.8181818),
    RETINA(800, 600, 25, 4481.8181818);

    private final int largoPanel;
    private final int altoPanel;
    private final int periodo;
    private final double pixelsAMetros;


    Pantalla(int largoPanel, int altoPanel, int periodo, double pixelsAMetros) {
        this.largoPanel = largoPanel;
        this.altoPanel = altoPanel;
        this.periodo = periodo;
        this.pixelsAMetros = pixelsAMetros;
    }

    public int getLargoPanel() {
        return largoPanel;
    }

    public int getAltoPanel() {
        return altoPanel;
    }

    public int getPeriodo() {
        return periodo;
    }

    public double getPixelsAMetros() {
        return pixelsAMetros;
    }
}
