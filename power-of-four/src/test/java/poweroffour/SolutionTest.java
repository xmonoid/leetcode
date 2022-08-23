package poweroffour;

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
    void isPowerOfFour0() {
        assertTrue(solution.isPowerOfFour(16));
    }

    @Test
    void isPowerOfFour1() {
        assertFalse(solution.isPowerOfFour(5));
    }

    @Test
    void isPowerOfFour2() {
        assertTrue(solution.isPowerOfFour(1));
    }

    @Test
    void isPowerOfFour3() {
        assertFalse(solution.isPowerOfFour(8));
    }
}