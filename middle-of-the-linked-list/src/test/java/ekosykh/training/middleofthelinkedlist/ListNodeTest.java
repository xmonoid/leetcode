package ekosykh.training.middleofthelinkedlist;

import org.junit.jupiter.api.Test;

import static ekosykh.training.middleofthelinkedlist.SolutionTest.list;
import static org.junit.jupiter.api.Assertions.*;

class ListNodeTest {

    @Test
    void testEquals() {
        var one = list(1, 2, 3);
        var two = list(1, 2, 3);
        var three = list(1, 2);
        var four = list(1, 2, 3, 4);
        var five = list(1, 3, 2);
        assertEquals(one, two);
        assertEquals(two, one);
        assertNotEquals(one, three);
        assertNotEquals(one, four);
        assertNotEquals(one, five);
    }
}