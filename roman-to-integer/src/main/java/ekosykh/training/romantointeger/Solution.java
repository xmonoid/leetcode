package ekosykh.training.romantointeger;

public class Solution {
    /**
     * Roman numerals are represented by seven different symbols: {@code I}, {@code V}, {@code X}, {@code L},
     * {@code C}, {@code D} and {@code M}.
     * <table border="1">
     *  <tr>
     *      <th>Symbol</th><th>Value</th>
     *  </tr>
     *  <tr>
     *      <td>I<td/><td>1<td/>
     *  </tr>
     *  <tr>
     *      <td>V<td/><td>5<td/>
     *  </tr>
     *  <tr>
     *      <td>X<td/><td>10<td/>
     *  </tr>
     *  <tr>
     *      <td>L<td/><td>50<td/>
     *  </tr>
     *  <tr>
     *      <td>C<td/><td>100<td/>
     *  </tr>
     *  <tr>
     *      <td>D<td/><td>500<td/>
     *  </tr>
     *  <tr>
     *      <td>M<td/><td>1000<td/>
     *  </tr>
     * </table>
     * <p/>
     * For example, {@code 2} is written as {@code II} in Roman numeral, just two ones added together.
     * {@code 12} is written as {@code XII}, which is simply {@code X + II}. The number {@code 27} is written
     * as {@code XXVII}, which is {@code XX + V + II}.
     * <p/>
     * Roman numerals are usually written largest to smallest from left to right.
     * However, the numeral for four is not {@code IIII}. Instead, the number four is written as {@code IV}.
     * Because the one is before the five we subtract it making four. The same principle applies to the number nine,
     * which is written as {@code IX}. There are six instances where subtraction is used:
     * <ul>
     *     <li>{@code I} can be placed before {@code V} (5) and {@code X} (10) to make 4 and 9. </li>
     *     <li>{@code X} can be placed before {@code L} (50) and {@code C} (100) to make 40 and 90. </li>
     *     <li>{@code C} can be placed before {@code D} (500) and {@code M} (1000) to make 400 and 900.</li>
     * </ul>
     *
     * Given a roman numeral, convert it to an integer.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>{@code 1 <= s.length <= 15}</li>
     *     <li>{@code s} contains only the characters {@code ('I', 'V', 'X', 'L', 'C', 'D', 'M')}.</li>
     *     <li>It is <b>guaranteed</b> that {@code s} is a valid roman numeral in the range {@code [1, 3999]}</li>
     * </ul>
     *
     * @see <a href="https://leetcode.com/problems/roman-to-integer/">13. Roman to Integer</a>
     */
    public static int romanToInt(String s) {
        int result = 0;
        final int n = s.length();
        for (int i = 0; i < n; i++) {
            switch (s.codePointAt(i)) {
                case 77: // M
                    result += 1000;
                    break;
                case 68: // D
                    result += 500;
                    break;
                case 67: // C
                    if ((i+1 < n) && (s.codePointAt(i+1)==68 || s.codePointAt(i+1)==77)) {
                        result -= 100;
                    } else {
                        result += 100;
                    }
                    break;
                case 76: // L
                    result += 50;
                    break;
                case 88: // X
                    if ((i+1 < n) && (s.codePointAt(i+1)==76 || s.codePointAt(i+1)==67)) {
                        result -= 10;
                    } else {
                        result += 10;
                    }
                    break;
                case 86: // V
                    result += 5;
                    break;
                case 73: // I
                    if ((i+1 < n) && (s.codePointAt(i+1)==86 || s.codePointAt(i+1)==88)) {
                        result -= 1;
                    } else {
                        result += 1;
                    }
                    break;
            }
        }
        return result;
    }
}
