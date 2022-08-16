package ekosykh.training.missingnumber;

public class Solution {
    /**
     * Given an array <code>nums</code> containing <code>n</code> distinct numbers in the range <code>[0, n]</code>,
     * return <i>the only number in the range that is missing from the array</i>.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>n == nums.length</code></li>
     *     <li><code>1 <= n <= 10^4</code></li>
     *     <li><code>0 <= nums[i] <= n</code></li>
     *     <li>All the numbers of <code>nums</code> are <b>unique</b>.</li>
     * </ul>
     * <p/>
     * <b>Follow up:</b> Could you implement a solution using only <code>O(1)</code> extra space complexity
     * and <code>O(n)</code> runtime complexity?
     */
    public int missingNumber(int[] nums) {
        final int expectedSum = (nums.length + 1) * nums.length / 2;
        int actualSum = 0;
        for (int num: nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
}
