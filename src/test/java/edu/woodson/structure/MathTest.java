package edu.woodson.structure;

import edu.woodson.math.Physics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MathTest {

    @Test
    void equations() {
        double result = Physics.getGravitationalForce(201848605, 5.9742E24, 6.38E6);
        Assertions.assertEquals(1.9771988750120218E9, result);
    }
}
