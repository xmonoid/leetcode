package ekosykh.training.numberofstepstoreduceanumbertozero;

public class Solution {
    /**
     * Given an integer {@code num}, return the number of steps to reduce it to zero.
     * <p/>
     * In one step, if the current number is even, you have to divide it by 2,
     * otherwise, you have to subtract 1 from it.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>{@code 0 <= num <= 10^6}</li>
     * </ul>
     *
     * @see <a href="https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/">
     *     1342. Number of Steps to Reduce a Number to Zero</a>
     */
    public static int numberOfSteps(int num) {
        if (num == 0) return 0;
        int result = -1;
        for (;num > 0; num >>= 1) {
            if (num % 2 == 0) {
                result++;
            } else {
                result+=2;
            }
        }
        return result;
    }
}