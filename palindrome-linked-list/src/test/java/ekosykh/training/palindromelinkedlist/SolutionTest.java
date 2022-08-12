package ekosykh.training.palindromelinkedlist;

import org.junit.jupiter.api.Test;

import static ekosykh.training.palindromelinkedlist.Solution.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindromeTest() {
        var input = list(1,2,2,1);
        assertTrue(isPalindrome(input));
        input = list(1,2);
        assertFalse(isPalindrome(input));
        input = list(1,3,1);
        assertTrue(isPalindrome(input));
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