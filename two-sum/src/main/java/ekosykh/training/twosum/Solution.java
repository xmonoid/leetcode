package ekosykh.training.twosum;

public class Solution {
    /**
     * Given an array of integers <code>nums</code> and an integer <code>target</code>,
     * return <i>indices of the two numbers such that they add up to <code>target</code></i>.
     * <p/>
     * You may assume that each input would have <b><i>exactly</i> one solution</b>,
     * and you may not use the same element twice.
     * <p/>
     * You can return the answer in any order.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>2 <= nums.length <= 10^4</code></li>
     *     <li><code>-10^9 <= nums[i] <= 10^9</code></li>
     *     <li><code>-10^9 <= target <= 10^9</code></li>
     *     <li><b>Only one valid answer exists.</b></li>
     * </ul>
     * <b>Follow-up:</b> Can you come up with an algorithm that is less than O(n^2) time complexity?
     * @see <a href="https://leetcode.com/problems/two-sum/">1. Two Sum</a>
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[0];
    }
}
