package ekosykh.training.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static ekosykh.training.longestcommonprefix.Solution.longestCommonPrefix;
import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestCommonPrefixTest() {
        var input = new String[] {"flower","flow","flight"};
        assertEquals("fl", longestCommonPrefix(input));
        input = new String[] {"dog","racecar","car"};
        assertEquals("", longestCommonPrefix(input));
        input = new String[] {"a","","b"};
        assertEquals("", longestCommonPrefix(input));
        input = new String[] {""};
        assertEquals("", longestCommonPrefix(input));
        input = new String[] {"w"};
        assertEquals("w", longestCommonPrefix(input));
    }
}