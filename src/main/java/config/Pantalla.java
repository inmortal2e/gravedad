package config;

/**
 * Created by vdelrio on 10/27/15.
 */
public enum Pantalla {

    NORMAL(1100, 700, 5, 5032),
    RETINA(800, 600, 25, 4481.82);

    private final int largoPanel;
    private final int altoPanel;
    private final int periodo;
    private final double pixelsPorMetro;


    Pantalla(int largoPanel, int altoPanel, int periodo, double pixelsPorMetro) {
        this.largoPanel = largoPanel;
        this.altoPanel = altoPanel;
        this.periodo = periodo;
        this.pixelsPorMetro = pixelsPorMetro;
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

    public double getPixelsPorMetro() {
        return pixelsPorMetro;
    }
}
