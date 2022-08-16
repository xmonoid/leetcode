package ekosykh.training.missingnumber;

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
    void missingNumber00() {
        int[] input = {3,0,1};
        assertEquals(2, solution.missingNumber(input));
    }

    @Test
    void missingNumber10() {
        int[] input = {0,1};
        assertEquals(2, solution.missingNumber(input));
    }

    @Test
    void missingNumber20() {
        int[] input = {9,6,4,2,3,5,7,0,1};
        assertEquals(8, solution.missingNumber(input));
    }

    @Test
    void missingNumber30() {
        int[] input = {1};
        assertEquals(0, solution.missingNumber(input));
    }

    @Test
    void missingNumber40() {
        int[] input = {1,2,3,4,5};
        assertEquals(0, solution.missingNumber(input));
    }
}