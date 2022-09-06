package integertoroman;

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
    void intToRoman0() {
        assertEquals("III", solution.intToRoman(3));
    }

    @Test
    void intToRoman1() {
        assertEquals("LVIII", solution.intToRoman(58));
    }

    @Test
    void intToRoman2() {
        assertEquals("MCMXCIV", solution.intToRoman(1994));
    }

    @Test
    void intToRoman3() {
        assertEquals("MMCDXLVIII", solution.intToRoman(2448));
    }

    @Test
    void intToRoman4() {
        assertEquals("MMMCMXCIX", solution.intToRoman(3999));
    }
}