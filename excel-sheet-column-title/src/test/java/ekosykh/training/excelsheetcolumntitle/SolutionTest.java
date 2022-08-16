package ekosykh.training.excelsheetcolumntitle;

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
    void convertToTitle00() {
        assertEquals("A", solution.convertToTitle(1));
    }

    @Test
    void convertToTitle10() {
        assertEquals("Z", solution.convertToTitle(26));
    }

    @Test
    void convertToTitle20() {
        assertEquals("AB", solution.convertToTitle(28));
    }

    @Test
    void convertToTitle30() {
        assertEquals("ZY", solution.convertToTitle(701));
    }
}