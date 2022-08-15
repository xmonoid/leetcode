package ekosykh.training.maximumsubarray;

import org.junit.jupiter.api.Test;

import static ekosykh.training.maximumsubarray.Subarray.maxSubArray;
import static org.junit.jupiter.api.Assertions.*;

class SubarrayTest {

    @Test
    void maxSubArrayTest() {
        var input = new int[] {1};
        assertEquals(1, maxSubArray(input));
        input = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        assertEquals(6, maxSubArray(input)); // [4,-1,2,1]
        input = new int[] {5,4,-1,7,8};
        assertEquals(23, maxSubArray(input)); // [5,4,-1,7,8]
        input = new int[] {-2,1,3,4,-1,2,1,-5,4};
        assertEquals(10, maxSubArray(input)); // [1,3,4,-1,2,1]
    }
}