package ekosykh.training.fizzbuzz;

import org.junit.jupiter.api.Test;

import java.util.List;

import static ekosykh.training.fizzbuzz.Solution.fizzBuzz;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void fizzBuzzTest() {
        assertEquals(List.of("1","2","Fizz"), fizzBuzz(3));
        assertEquals(List.of("1","2","Fizz","4","Buzz"), fizzBuzz(5));
        assertEquals(List.of("1","2","Fizz","4","Buzz","Fizz","7","8",
                "Fizz","Buzz","11","Fizz","13","14","FizzBuzz"), fizzBuzz(15));
    }
}