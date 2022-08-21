package addtwonumbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void addTwoNumbers00() {
        var l1 = list(2,4,3);
        var l2 = list(5,6,4);
        var expected = list(7,0,8);
        var actual = solution.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers10() {
        var l1 = list(0);
        var l2 = list(0);
        var expected = list(0);
        var actual = solution.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers15() {
        var l1 = list(9);
        var l2 = list(9);
        var expected = list(8,1);
        var actual = solution.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers16() {
        var l1 = list(9);
        var l2 = list(9,9,9);
        var expected = list(8,0,0,1);
        var actual = solution.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers20() {
        var l1 = list(9,9,9,9,9,9,9);
        var l2 = list(9,9,9,9);
        var expected = list(8,9,9,9,0,0,0,1);
        var actual = solution.addTwoNumbers(l1, l2);
        assertEquals(expected, actual);
    }

    @Test
    void addTwoNumbers30() {
        var l1 = list(9,9,1);
        var l2 = list(1);
        var expected = list(0,0,2);
        var actual = solution.addTwoNumbers(l1, l2);
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