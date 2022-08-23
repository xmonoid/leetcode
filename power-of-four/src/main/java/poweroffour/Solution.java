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
        // 1    -> 0b0000_0001
        // 4    -> 0b0000_0100
        // 16   -> 0b0001_0000
        // 64   -> 0b0100_0000
        if (n <= 0) {
            return false;
        }
        for (int x = 1; x > 0; x *= 4) {
            if ((n ^ x) == 0) {
                return true;
            }
        }
        return false;
    }
}
