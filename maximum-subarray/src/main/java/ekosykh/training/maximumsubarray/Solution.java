package ekosykh.training.maximumsubarray;

public class Solution {
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
    public int maxSubArray(int[] nums) {
        max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        int sum = sumSubArrayLeft(nums, 0, nums.length-1);
        return Math.max(max, sum);
    }

    private int max;

    private int sumSubArrayLeft(int[] nums, int left, int right) {
        while (left < right && nums[left] <= 0) {
            left++;
        }
        if (left == right) {
            return nums[left];
        }
        while (right > left && nums[right] <= 0) {
            right--;
        }
        int current = nums[left];
        if (current > max) {
            max = current;
        }
        for (int i = left+1; i <= right; i++) {
            current += nums[i];
            if (current < 0) {
                return sumSubArrayRight(nums, i+1, right);
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }

    private int sumSubArrayRight(int[] nums, int left, int right) {
        while (right > left && nums[right] <= 0) {
            right--;
        }
        while (left < right && nums[left] <= 0) {
            left++;
        }
        int current = nums[right];
        if (current > max) {
            max = current;
        }
        for (int i = right-1; i >= left ; i--) {
            current += nums[i];
            if (current < 0) {
                return sumSubArrayLeft(nums, left, i-1);
            }
            if (current > max) {
                max = current;
            }
        }
        return max;
    }
}
