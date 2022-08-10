package ekosykh.training.numberofstepstoreduceanumbertozero;

import org.junit.jupiter.api.Test;

import static ekosykh.training.numberofstepstoreduceanumbertozero.Solution.numberOfSteps;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numberOfStepsTest() {
        assertEquals(0, numberOfSteps(0));
        assertEquals(1, numberOfSteps(1));
        assertEquals(6, numberOfSteps(14));
        assertEquals(4, numberOfSteps(8));
        assertEquals(12, numberOfSteps(123));
    }
}