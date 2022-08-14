package ekosykh.training.maximumsubarray;

public class Subarray {
    /**
     * Given an integer array <code>nums</code>, find the contiguous subarray (containing at least one number)
     * which has the largest sum and return <i>its sum</i>.
     * <p/>
     * A <b>subarray</b> is a <b>contiguous</b> part of an array.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>1 <= nums.length <= 10^5</code></li>
     *     <li>-10^4 <= nums[i] <= 10^4<code></code></li>
     * </ul>
     * <p/>
     * <b>Follow up:</b> If you have figured out the <code>O(n)</code> solution,
     * try coding another solution using the <b>divide and conquer</b> approach, which is more subtle.
     */
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 0; j <= nums.length-i; j++) {
                int current = sumSubArray(nums, j, j + i);
                if (current > max) {
                    max = current;
                }
            }
        }
        return max;
    }

    private static int sumSubArray(int[] nums, int from, int to) {
        int result = 0;
        for (int i = from; i < to; i++) {
            result += nums[i];
        }
        return result;
    }
}
