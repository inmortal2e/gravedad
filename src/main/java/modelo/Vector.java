package modelo;

/**
 * Created by victor on 10/19/15.
 */
public class Vector {

    private double x;
    private double y;


    /*------------------------------------ Static methods ----------------------------------*/

    public static final Vector NULO = new Vector(0, 0);

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Constructors ------------------------------------*/

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Public methods ----------------------------------*/

    public double modulo() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector sumarCon(Vector vector) {
        return new Vector(this.getX() + vector.getX(), this.getY() + vector.getY());
    }

    public Vector multiplicarPor(double escalar) {
        return new Vector(escalar * this.getX(), escalar * this.getY());
    }

    /*--------------------------------------------------------------------------------------*/
    /*---------------------------------- Geters and seters ---------------------------------*/

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /*--------------------------------------------------------------------------------------*/

}
