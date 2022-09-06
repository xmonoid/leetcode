package integertoroman;

public class Solution {
    /**
     * Roman numerals are represented by seven different symbols: <code>I</code>, <code>V</code>, <code>X</code>,
     * <code>L</code>, <code>C</code>, <code>D</code> and <code>M</code>.
     * <p/>
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
     * <p/>
     * Given an integer, convert it to a roman numeral.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>1 <= num <= 3999</li>
     * </ul>
     */
    public String intToRoman(int num) {
        var result = new StringBuilder();

        int m = num / 1000;
        result.append("M".repeat(m));
        num %= 1000;
        if (num >= 900) {
            result.append("CM");
            num -= 900;
        } else if (num >= 500) {
            result.append("D");
            num -= 500;
        } else if (num >= 400) {
            result.append("CD");
            num -= 400;
        }

        if (num >= 100) {
            int c = num / 100;
            result.append("C".repeat(c));
            num %= 100;
        }

        if (num >= 90) {
            result.append("XC");
            num -= 90;
        } else if (num >= 50) {
            result.append("L");
            num -= 50;
        } else if (num >= 40) {
            result.append("XL");
            num -= 40;
        }

        if (num >= 10) {
            int x = num / 10;
            result.append("X".repeat(x));
            num %= 10;
        }

        if (num == 9) {
            result.append("IX");
            num = 0;
        } else if (num >= 5) {
            result.append("V");
            num -= 5;
        } else if (num == 4) {
            result.append("IV");
            num = 0;
        }

        if (num >= 1) {
            result.append("I".repeat(num));
        }

        return result.toString();
    }
}
