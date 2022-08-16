package ekosykh.training.excelsheetcolumntitle;

public class Solution {
    /**
     * Given an integer <code>columnNumber</code>, return <i>its corresponding column title as
     * it appears in an Excel sheet</i>.
     * <p/>
     * For example:
     * <code>
     * A -> 1
     * B -> 2
     * C -> 3
     * ...
     * Z -> 26
     * AA -> 27
     * AB -> 28
     * ...
     * </code>
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>1 <= columnNumber <= 2^31 - 1</code></li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/excel-sheet-column-title/">168. Excel Sheet Column Title</a>
     */
    public String convertToTitle(int columnNumber) {
        var result = new StringBuilder();
        do {
            columnNumber--;
            int letter = columnNumber % 26 + 65;
            result.insert(0, (char) letter);
            columnNumber /= 26;
        } while (columnNumber > 0);

        return result.toString();
    }
}
