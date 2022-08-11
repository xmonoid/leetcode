package ekosykh.training.ransomnote;

import org.junit.jupiter.api.Test;

import static ekosykh.training.ransomnote.Solution.canConstruct;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void canConstructTest() {
        assertFalse(canConstruct("a", "b"));
        assertFalse(canConstruct("aa", "ab"));
        assertTrue(canConstruct("aa", "aab"));
    }
}