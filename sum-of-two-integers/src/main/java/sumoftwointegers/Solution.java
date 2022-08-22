package sumoftwointegers;

public class Solution {
    /**
     * Given two integers <code>a</code> and <code>b</code>, return the sum of the two integers
     * without using the operators <code>+</code> and <code>-</code>.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>-1000 <= a, b <= 1000</code></li>
     * </ul>
     * <p/>
     * @see <a href="https://leetcode.com/problems/sum-of-two-integers/">371. Sum of Two Integers</a>
     */
    public int getSum(int a, int b) {
        while (b != 0) {            // Повторяем, пока слагаемое не обратится в 0
            final int c = a & b;    // Выявляем биты переполнения
            a ^= b;                 // Складываем биты с помощью XOR
            b = c << 1;             // Биты переполнения сдвигаем на 1 влево
        }
        return a;
    }
}
