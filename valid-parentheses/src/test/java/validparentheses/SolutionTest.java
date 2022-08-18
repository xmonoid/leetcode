package validparentheses;

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
    void isValid0() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void isValid1() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void isValid2() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void isValid3() {
        assertFalse(solution.isValid("]"));
    }

    @Test
    void isValid4() {
        assertFalse(solution.isValid("{"));
    }
}