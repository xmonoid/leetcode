package ekosykh.training.richestcustomerwealth;

import org.junit.jupiter.api.Test;

import static ekosykh.training.richestcustomerwealth.Solution.maximumWealth;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maximumWealthTest() {
        var array = new int[][] {{1,2,3}, {3,2,1}};
        assertEquals(6, maximumWealth(array));
        array = new int[][] {{1,5},{7,3},{3,5}};
        assertEquals(10, maximumWealth(array));
        array = new int[][] {{2,8,7},{7,1,3},{1,9,5}};
        assertEquals(17, maximumWealth(array));
    }
}