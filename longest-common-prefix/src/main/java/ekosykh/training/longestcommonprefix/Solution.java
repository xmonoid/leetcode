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
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() <= i
                        || strs[0].codePointAt(i) != strs[j].codePointAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
}
