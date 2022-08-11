package ekosykh.training.middleofthelinkedlist;

import org.junit.jupiter.api.Test;

import static ekosykh.training.middleofthelinkedlist.Solution.middleNode;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void middleNodeTest() {
        var input = list(1,2,3,4,5);
        var expected = list(3,4,5);
        var actual = middleNode(input);
        assertEquals(expected, actual);

        input = list(1,2,3,4,5,6);
        expected = list(4,5,6);
        actual = middleNode(input);
        assertEquals(expected, actual);
    }

    static ListNode list(int... elements) {
        var head = new ListNode(elements[0]);
        var tail = head;
        for (int i = 1; i < elements.length; i++) {
            var node = new ListNode(elements[i]);
            tail.next = node;
            tail = node;
        }
        return head;
    }
}