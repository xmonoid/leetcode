package poweroffour;

public class Solution {
    /**
     * Given an integer <code>n</code>, return <i><code>true</code> if it is a power of four.
     * Otherwise, return <code>false</code></i>.
     * <p/>
     * An integer <code>n</code> is a power of four, if there exists an integer <code>x</code>
     * such that <code>n == 4^x</code>.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>-2^31 <= n <= 2^31 - 1</code></li>
     * </ul>
     * <b> Follow up:</b>  Could you solve it without loops/recursion?
     * @see <a href="https://leetcode.com/problems/power-of-four/">342. Power of Four</a>
     */
    public boolean isPowerOfFour(int n) {
        return n > 0                        // n should be positive
                && (n & (n-1)) == 0         // n should contain only one bitwise 1
                && (n & 0x5555_5555) != 0   // this 1 should be on odd position only
                ;
    }
}
