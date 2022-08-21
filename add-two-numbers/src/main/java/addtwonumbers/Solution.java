package addtwonumbers;

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
     * You are given two <b>non-empty</b> linked lists representing two non-negative integers.
     * The digits are stored in <b>reverse order</b>, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * <p/>
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>The number of nodes in each linked list is in the range <code>[1, 100]</code>.</li>
     *     <li><code>0 <= Node.val <= 9</code></li>
     *     <li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
     * </ul>
     * <p/>
     * @see <a href="https://leetcode.com/problems/add-two-numbers/">2. Add Two Numbers</a>
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int over = 0;
        var result = l1;
        while (l1.next != null && l2.next != null) {
            final int sum = l1.val + l2.val + over;
            l1.val = sum % 10;
            over = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }
        final int sum = l1.val + l2.val + over;
        l1.val = sum % 10;
        over = sum / 10;
        if (l1.next == null) {
            if (l2.next != null) {
                l1.next = l2.next;
                do {
                    l1 = l1.next;
                    final int sum1 = l1.val + over;
                    l1.val = sum1 % 10;
                    over = sum1 / 10;
                } while (l1.next != null);
            }
        } else {
            do {
                l1 = l1.next;
                final int sum1 = l1.val + over;
                l1.val = sum1 % 10;
                over = sum1 / 10;
            } while (l1.next != null);
        }
        if (over > 0) {
            l1.next = new ListNode(over);
        }
        return result;
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