package config;

/**
 * Created by vdelrio on 10/27/15.
 */
public enum Pantalla {

    NORMAL(1100, 700, 5032),
    RETINA(800, 600, 4481.82);

    private final int largoPanel;
    private final int altoPanel;
    private final double pixelsPorMetro;


    Pantalla(int largoPanel, int altoPanel, double pixelsPorMetro) {
        this.largoPanel = largoPanel;
        this.altoPanel = altoPanel;
        this.pixelsPorMetro = pixelsPorMetro;
    }

    public int getLargoPanel() {
        return largoPanel;
    }

    public int getAltoPanel() {
        return altoPanel;
    }

    public double getPixelsPorMetro() {
        return pixelsPorMetro;
    }
}
