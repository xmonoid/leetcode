package ekosykh.training.thekweakestrowsinamatrix;

import org.junit.jupiter.api.Test;

import static ekosykh.training.thekweakestrowsinamatrix.Solution.kWeakestRows;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void kWeakestRowsTest() {
        var input = new int[][]{{1,1,0,0,0},
                                {1,1,1,1,0},
                                {1,0,0,0,0},
                                {1,1,0,0,0},
                                {1,1,1,1,1}};
        var k = 3;
        var expected = new int[]{2,0,3};
        var actual = kWeakestRows(input, k);
        assertArrayEquals(expected, actual);

        input = new int[][]{{1,0,0,0},
                            {1,1,1,1},
                            {1,0,0,0},
                            {1,1,0,0}};
        k = 2;
        expected = new int[]{0,2};
        actual = kWeakestRows(input, k);
        assertArrayEquals(expected, actual);
    }
}