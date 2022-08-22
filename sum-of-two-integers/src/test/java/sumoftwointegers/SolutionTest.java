package sumoftwointegers;

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
    void getSum0() {
        assertEquals(0b0011, solution.getSum(0b0001, 0b0010));
    }

    @Test
    void getSum1() {
        assertEquals(0b0101, solution.getSum(0b0010, 0b0011));
    }

    @Test
    void getSum2() {
        assertEquals(0, solution.getSum(-1, 1));
    }

    @Test
    void getSum3() {
        assertEquals(0b1010, solution.getSum(0b0101, 0b0101));
    }

    @Test
    void getSum4() {
        assertEquals(0b1100, solution.getSum(0b0111, 0b0101));
    }
}