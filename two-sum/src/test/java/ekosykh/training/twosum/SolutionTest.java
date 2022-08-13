package ekosykh.training.twosum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static ekosykh.training.twosum.Solution.twoSum;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void twoSumTest() {
        var nums = new int[] {2,7,11,15};
        var target = 9;
        var expected = List.of(0,1);
        var actual = Arrays.stream(twoSum(nums, target)).boxed().collect(Collectors.toList());
        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual) && actual.containsAll(expected));

        nums = new int[] {3,2,4};
        target = 6;
        expected = List.of(1,2);
        actual = Arrays.stream(twoSum(nums, target)).boxed().collect(Collectors.toList());
        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual) && actual.containsAll(expected));

        nums = new int[] {3,3};
        expected = List.of(0,1);
        actual = Arrays.stream(twoSum(nums, target)).boxed().collect(Collectors.toList());
        assertTrue(expected.size() == actual.size()
                && expected.containsAll(actual) && actual.containsAll(expected));
    }
}