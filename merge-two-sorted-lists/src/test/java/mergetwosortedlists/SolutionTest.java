package mergetwosortedlists;

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
    void mergeTwoLists00() {
        var list1 = list();
        var list2 = list();
        var expected= list();
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists10() {
        var list1 = list();
        var list2 = list(0);
        var expected= list(0);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists20() {
        var list1 = list(0);
        var list2 = list();
        var expected= list(0);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists30() {
        var list1 = list(1);
        var list2 = list(2);
        var expected= list(1,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists40() {
        var list1 = list(2);
        var list2 = list(1);
        var expected= list(1,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists50() {
        var list1 = list(1);
        var list2 = list(1,2);
        var expected= list(1,1,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists60() {
        var list1 = list(1,1);
        var list2 = list(2);
        var expected= list(1,1,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists70() {
        var list1 = list(1,1);
        var list2 = list(2,2);
        var expected= list(1,1,2,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists80() {
        var list1 = list(2,2);
        var list2 = list(1,1);
        var expected= list(1,1,2,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists90() {
        var list1 = list(1,1);
        var list2 = list(1,2);
        var expected= list(1,1,1,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists100() {
        var list1 = list(1,2);
        var list2 = list(1,1);
        var expected= list(1,1,1,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists110() {
        var list1 = list(1,2);
        var list2 = list(1,2);
        var expected= list(1,1,2,2);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists120() {
        var list1 = list(1,2,4);
        var list2 = list(1,3,4);
        var expected= list(1,1,2,3,4,4);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists130() {
        var list1 = list(1,1,1,2,2,3,3);
        var list2 = list(1,1,2,2,2,2,3);
        var expected= list(1,1,1,1,1,2,2,2,2,2,2,3,3,3);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    @Test
    void mergeTwoLists140() {
        var list1 = list(1,1,2,3,3,4);
        var list2 = list(1,2,2,2,3);
        var expected= list(1,1,1,2,2,2,2,3,3,3,4);
        var actual = solution.mergeTwoLists(list1, list2);
        assertEquals(expected, actual);
    }

    static ListNode list(int... elements) {
        if (elements.length == 0) {
            return null;
        }
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