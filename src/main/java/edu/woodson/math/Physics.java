package edu.woodson.math;

public class Physics {
    public static final double GRAVITATIONAL_CONSTANT = 6.674E-11; // The Gravitational Constant of 6.674E-11 Newtons

    /**
     *
     * @param m1 - the first mass (Must be in KG)
     * @param m2 - the second mass (Must be in KG)
     * @param r - the distance between the centers of the masses (Must be in Meters)
     * @return the gravitiaional force in NEWTONS
     */
    public static double getGravitationalForce(double m1, double m2, double r) {
        return GRAVITATIONAL_CONSTANT * ((m1 * m2) / Math.pow(r, 2));
    }

}
