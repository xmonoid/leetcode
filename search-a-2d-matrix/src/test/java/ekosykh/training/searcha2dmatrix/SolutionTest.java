package ekosykh.training.searcha2dmatrix;

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
    void searchMatrix0() {
        var input = new int[][] {{0}};
        assertTrue(solution.searchMatrix(input, 0));
    }

    @Test
    void searchMatrix1() {
        var input = new int[][] {{1}};
        assertFalse(solution.searchMatrix(input, 0));
    }

    @Test
    void searchMatrix2() {
        var input = new int[][] {{1},{3}};
        assertTrue(solution.searchMatrix(input, 1));
    }

    @Test
    void searchMatrix3() {
        var input = new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        assertTrue(solution.searchMatrix(input, 3));
    }

    @Test
    void searchMatrix4() {
        var input = new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}};
        assertFalse(solution.searchMatrix(input, 13));
    }

    @Test
    void searchMatrix5() {
        var input = new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60},
                {65,67,70,73}};
        assertFalse(solution.searchMatrix(input, 61));
    }
}