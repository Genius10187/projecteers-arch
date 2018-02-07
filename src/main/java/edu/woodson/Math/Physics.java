package edu.woodson.Math;

public class Physics {
    private static final double GRAVIATAIONAL_CONSTATNT = 0.0000000000674;

    /**
     *
     * @param m1 - the first mass
     * @param m2 - the second mass
     * @param r - the distance between the centers of the masses
     * @return the gravitiaional force in NEWTONS
     */
    public static double getGravitationalForce(double m1, double m2, double r) {
        return GRAVIATAIONAL_CONSTATNT * (m1 * m2) / Math.pow(r, 2);
    }

    /**
     *
     * @return the Gravitational Constant of 6.674E-11 Newton
     */
    public static double getGRAVIATAIONAL_CONSTATNT() {
        return GRAVIATAIONAL_CONSTATNT;
    }
}
