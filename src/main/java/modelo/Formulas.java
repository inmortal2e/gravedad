package modelo;

/**
 * Created by vdelrio on 10/23/15.
 */
public class Formulas {

    public static final double G = 6.67300E-11;


    /**
     *
     * @param objeto1
     * @param objeto2
     * @return
     */
    public static Vector gravitacionUniversal(Objeto objeto1, Objeto objeto2) {

        double cte = (-1) * G * objeto1.getMasa() * objeto2.getMasa() / Math.pow(objeto2.getPosicion().menos(objeto1.getPosicion()).modulo(), 3);
        return objeto2.getPosicion().menos(objeto1.getPosicion()).por(cte);
    }

    /**
     * x = x0 + v0 * t + 0.5 * a * t*t
     *
     * @param posicionInicial
     * @param velocidad
     * @param tiempo
     * @param aceleracion
     * @return
     */
    public static Vector cinematicaEspacio(Vector posicionInicial, Vector velocidad, double tiempo, Vector aceleracion) {
        return posicionInicial.mas(velocidad.por(tiempo)).mas(aceleracion.por(0.5 * Math.pow(tiempo, 2)));
    }

    /**
     * v = v0 + a * t
     *
     * @param velocidadInicial
     * @param aceleracion
     * @param tiempo
     * @return
     */
    public static Vector cinematicaVelocidad(Vector velocidadInicial, Vector aceleracion, double tiempo) {
        return velocidadInicial.mas(aceleracion.por(tiempo));
    }

}
