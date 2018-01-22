package edu.woodson.structure;

import edu.woodson.structure.node.Node;
import edu.woodson.structure.node.binding.NodeBinding;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StructuresTest {
    @Test
    void load() {

    }

    @Test
    void load1() {
        Node test1 = new Node();
        Node test2 = new Node();
        List<Node> nodes = Arrays.asList(
                test1,
                test2);
        List<Long[]> links = Arrays.asList(
                new Long[]{1L},
                new Long[]{0L}
        );

        Structure structure = Structures.load(new NodeBinding(nodes, links));
        Set<Node> structureNodes = structure.getNodes();

        assertEquals(2, structureNodes.size());

        assertEquals(1, structureNodes.size());
        assertEquals(1, structureNodes.size());

        assertTrue(structureNodes.contains(test2));
        assertTrue(structureNodes.contains(test1));
    }
}