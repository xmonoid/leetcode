package ekosykh.training.palindromenumber;

public class Solution {
    /**
     * Given an integer <code>x</code>, return <code>true</code> if <code>x</code> is palindrome integer.
     * <p/>
     * An integer is a <b>palindrome</b> when it reads the same backward as forward.
     * <p/>
     * For example, 121 is a palindrome while 123 is not.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>-2^31 <= x <= 2^31 - 1</code></li>
     * </ul>
     * <p/>
     * <b>Follow up:</b> Could you solve it without converting the integer to a string?
     */
    public static boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x < 0 || x % 10 == 0) return false;

        int reverse = 0;
        do {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        } while (x > reverse);
        if (x == reverse)
            return true;
        else {
            return x == reverse/10;
        }
    }
}
