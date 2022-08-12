package ekosykh.training.palindromelinkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Solution {
    /**
     * Given the {@code head} of a singly linked list, return {@code true} if it is a palindrome.
     *<p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>The number of nodes in the list is in the range {@code [1, 10^5]}.</li>
     *     <li>{@code 0 <= Node.val <= 9}</li>
     * </ul>
     * <p/>
     * <b>Follow up:</b> Could you do it in {@code O(n)} time and {@code O(1)} space?
     * @see <a href="https://leetcode.com/problems/palindrome-linked-list/">234. Palindrome Linked List</a>
     */
    public static boolean isPalindrome(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            current = current.next;
            length++;
        }
        current = head;
        int sum = 0;
        int sum_multi = 0;
        for (int i = 1; i <= length/2; i++) {
            sum += current.val;
            sum_multi += current.val * i;
            current = current.next;
        }
        if (length % 2 == 1) {
            current = current.next;
        }
        for (int i = length/2; i > 0; i--) {
            sum -= current.val;
            sum_multi -= current.val * i;
            current = current.next;
        }

        return (sum == 0) && (sum_multi == 0);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        if (obj == this) return true;
        ListNode thisNode = this;
        ListNode anotherNode = (ListNode) obj;
        while (thisNode != null) {
            if (anotherNode == null || thisNode.val != anotherNode.val) {
                return false;
            }
            thisNode = thisNode.next;
            anotherNode = anotherNode.next;
        }
        return anotherNode == null;
    }

    @Override
    public String toString() {
        var result = new StringBuilder("[");
        for (var node = this; node != null; node = node.next) {
            result.append(node.val).append(", ");
        }
        int start = result.lastIndexOf(", ");
        result.delete(start, start+2).append("]");
        return result.toString();
    }
}
