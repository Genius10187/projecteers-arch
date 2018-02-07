package edu.woodson.Math;

public class Physics {
    private static final double GRAVIATAIONAL_CONSTATNT = 0.0000000000674;

    public static double getGravity(double m1, double m2, double r) {
        double gravity = GRAVIATAIONAL_CONSTATNT * (m1 * m2) / Math.pow(r, 2);

        return gravity;
    }

    public static double getGRAVIATAIONAL_CONSTATNT() {
        return GRAVIATAIONAL_CONSTATNT;
    }
}
