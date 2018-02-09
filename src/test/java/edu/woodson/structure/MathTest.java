package edu.woodson.structure;

import edu.woodson.formulas.Geometry;
import edu.woodson.formulas.Physics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {

    @Test
    void physics() {
        double force = Physics.findGravitationalForce(201848605, 5.9742E24, 6.38E6);
        Assertions.assertEquals(1.9771988750120218E9, force);

        double pipeFlowRate = Physics.findPipeFlowRate(4, 2);
        Assertions.assertEquals(Math.PI * Math.pow(4, 2) * 2, pipeFlowRate);
    }

    @Test
    void geometry() {
        double circleCircumference = Geometry.findCircleCircumference(4);
        Assertions.assertEquals(2 * Math.PI * 4, circleCircumference);

        double circleArea = Geometry.findCircleArea(4);
        Assertions.assertEquals(Math.PI * Math.pow(4, 2), circleArea);
    }
}
