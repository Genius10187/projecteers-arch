package edu.woodson.formulas;

/**
 * @author jwh0101
 * @version 0.0.0
 * @since 8 February 2018
 */
public class Geometry {

    /**
     *
     * @param radius - the radius of the circle
     * @return the circumference of a 2D circle in the units of the radius
     */
    public static double findCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
