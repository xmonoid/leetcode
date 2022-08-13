package ekosykh.training.palindromenumber;

import org.junit.jupiter.api.Test;

import static ekosykh.training.palindromenumber.Solution.isPalindrome;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isPalindromeTest() {
        assertTrue(isPalindrome(0));
        assertTrue(isPalindrome(1));
        assertTrue(isPalindrome(11));
        assertTrue(isPalindrome(121));
        assertFalse(isPalindrome(-121));
        assertFalse(isPalindrome(10));
        assertFalse(isPalindrome(Integer.MIN_VALUE));
        assertFalse(isPalindrome(Integer.MAX_VALUE));
    }
}