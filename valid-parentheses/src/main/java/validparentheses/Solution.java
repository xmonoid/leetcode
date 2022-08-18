package validparentheses;

import java.util.LinkedList;

public class Solution {
    /**
     * Given a string <code>s</code> containing just the characters <code>'('</code>, <code>')'</code>,
     * <code>'{'</code>, <code>'}'</code>, <code>'['</code> and <code>']'</code>,
     * determine if the input string is valid.
     * <p/>
     * An input string is valid if:
     * <ol>
     *     <li>Open brackets must be closed by the same type of brackets.</li>
     *     <li>Open brackets must be closed in the correct order.</li>
     * </ol>
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li><code>1 <= s.length <= 10^4</code></li>
     *     <li><code>s</code> consists of parentheses only <code>'()[]{}'</code>.</li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/valid-parentheses/">20. Valid Parentheses</a>
     */
    public boolean isValid(String s) {
        byte[] chars = s.getBytes();
        var stack = new LinkedList<Byte>();
        for (byte c: chars) {
            switch (c) {
                case 40: // '('
                case 91: // '['
                case 123: // '{'
                    stack.addFirst(c);
                    break;
                case 41: // ')'
                    Byte last = stack.pollFirst();
                    if (last == null) {
                        return false;
                    } else if (last != 40) {
                        return false;
                    }
                    break;
                case 93: // ']'
                    last = stack.pollFirst();
                    if (last == null) {
                        return false;
                    } else if (last != 91) {
                        return false;
                    }
                    break;
                case 125: // '}'
                    last = stack.pollFirst();
                    if (last == null) {
                        return false;
                    } else if (last != 123) {
                        return false;
                    }
                    break;
            }
        }
        return stack.isEmpty();
    }
}
