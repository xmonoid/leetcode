package ekosykh.training.romantointeger;

import org.junit.jupiter.api.Test;

import static ekosykh.training.romantointeger.Solution.romanToInt;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    void romanToIntTest() {
        assertEquals(3, romanToInt("III"));
        assertEquals(58, romanToInt("LVIII"));
        assertEquals(1994, romanToInt("MCMXCIV"));
    }
}
