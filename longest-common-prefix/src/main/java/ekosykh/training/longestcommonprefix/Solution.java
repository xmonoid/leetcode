package ekosykh.training.longestcommonprefix;

public class Solution {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p/>
     * If there is no common prefix, return an empty string <code>""</code>.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>1 <= strs.length <= 200</code></li>
     *     <li><code>0 <= strs[i].length <= 200</code></li>
     *     <li><code>strs[i]</code> consists of only lowercase English letters.</li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/longest-common-prefix/">14. Longest Common Prefix</a>
     */
    public static String longestCommonPrefix(String[] strs) {
        String prefix = shortestWord(strs);
        for (String str : strs) {
            while (!prefix.equals(str.substring(0, prefix.length()))) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    private static String shortestWord(String[] strs) {
        String shortest = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (shortest.length() > strs[i].length()) {
                shortest = strs[i];
            }
        }
        return shortest;
    }
}
