package ekosykh.training.maximumsubarray;

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
    void maxSubArray0() {
        var input = new int[] {1};
        assertEquals(1, new Solution().maxSubArray(input)); // [1]
    }

    @Test
    void maxSubArray1() {
        var input = new int[] {2,3,0};
        assertEquals(5, new Solution().maxSubArray(input)); // [2,3]*/
    }

    @Test
    void maxSubArray2() {
        var input = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, new Solution().maxSubArray(input)); // [4,-1,2,1]*/
    }

    @Test
    void maxSubArray3() {
        var input = new int[] {5,4,-1,7,8};
        assertEquals(23, new Solution().maxSubArray(input)); // [5,4,-1,7,8]*/
    }

    @Test
    void maxSubArray4() {
        var input = new int[] {-2,1,3,4,-1,2,1,-5,4};
        assertEquals(10, new Solution().maxSubArray(input)); // [1,3,4,-1,2,1]*/
    }

    @Test
    void maxSubArray5() {
        var input = new int[] {3,-2,-3,-3,1,3,0};
        assertEquals(4, new Solution().maxSubArray(input)); // [1,3]*/
    }

    @Test
    void maxSubArray6() {
        var input = new int[] {3,2,-3,-1,1,-3,1,-1};
        assertEquals(5, new Solution().maxSubArray(input)); // [3,2]*/
        input = new int[] {31,-41,59,26,-53,58,97,-93,-23,84};
        assertEquals(187, new Solution().maxSubArray(input)); // [59,26,-53,58,97]
    }

    @Test
    void maxSubArray7() {
        var input = new int[] {31,-41,59,26,-53,58,97,-93,-23,84};
        assertEquals(187, new Solution().maxSubArray(input)); // [59,26,-53,58,97]
    }

    @Test
    void maxSubArray8() {
        var input = new int[] {-1};
        assertEquals(-1, new Solution().maxSubArray(input)); // [-1]
    }

    @Test
    void maxSubArray9() {
        var input = new int[] {-1, -2};
        assertEquals(-1, new Solution().maxSubArray(input)); // [-1]
    }

    @Test
    void maxSubArray10() {
        var input = new int[] {-2, -1};
        assertEquals(-1, new Solution().maxSubArray(input)); // [-1]
    }
}