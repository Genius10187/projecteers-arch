package edu.woodson.formulas;

/**
 * @author jwh0101
 * @version 0.0.0
 * @since 8 February 2018
 */
public class Physics {
    public static final double GRAVITATIONAL_CONSTANT = 6.674E-11; // The Gravitational Constant of 6.674E-11 Newtons

    /**
     *
     * @param m1 - the first mass (Must be in KG)
     * @param m2 - the second mass (Must be in KG)
     * @param r - the distance between the centers of the masses (Must be in Meters)
     * @return the gravitiaional force in NEWTONS
     */
    public static double findGravitationalForce(double m1, double m2, double r) {
        return GRAVITATIONAL_CONSTANT * ((m1 * m2) / Math.pow(r, 2));
    }

    /**
     *
     * @param radius - radius of the circular opening of the pipe (Must be in Meters)
     * @param velocity - velocity of the water flow (Must be in m/s)
     * @return the pipe's rate of flow in (L/s)
     */
    public static double findPipeFlowRate(double radius, double velocity) {
        return Geometry.findCircleArea(radius) * velocity;
    }

}
