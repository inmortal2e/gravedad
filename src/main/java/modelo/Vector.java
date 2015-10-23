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

    public Vector() {
        this(0, 0);
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /*--------------------------------------------------------------------------------------*/
    /*------------------------------------ Public methods ----------------------------------*/

    public double modulo() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public Vector mas(Vector vector) {
        return new Vector(this.getX() + vector.getX(), this.getY() + vector.getY());
    }

    public Vector menos(Vector vector) {
        return new Vector(this.getX() - vector.getX(), this.getY() - vector.getY());
    }

    public Vector por(double escalar) {
        return new Vector(escalar * this.getX(), escalar * this.getY());
    }

    public Vector dividido(double escalar) {
        return new Vector(this.getX() / escalar, this.getY() / escalar);
    }

    public double distancia(Vector vector) {
        return this.menos(vector).modulo();
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
