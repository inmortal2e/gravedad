package modelo;

/**
 * Created by victor on 10/18/15.
 */
public class Velocidad {

    private double x;
    private double y;


    // Dirección de desplazamiento y modulo

    public Velocidad(double anguloEnGrados, double valor) {

        double anguloEnRadianes = Math.toRadians(anguloEnGrados);

        this.x = valor * Math.cos(anguloEnRadianes);
        this.y = valor * Math.sin(anguloEnRadianes);
    }

}
