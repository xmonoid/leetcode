package mergetwosortedlists;

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
     * You are given the heads of two sorted linked lists <code>list1</code> and <code>list2</code>.
     * <p/>
     * Merge the two lists in a one <b>sorted</b> list. The list should be made by splicing together
     * the nodes of the first two lists.
     * <p/>
     * Return <i>the head of the merged linked list</i>.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>The number of nodes in both lists is in the range <code>[0, 50]</code></li>
     *     <li><code>-100 <= Node.val <= 100</code></li>
     *     <li>Both <code>list1</code> and <code>list2</code> are sorted in <b>non-decreasing</b> order.</li>
     * </ul>
     * @see <a href="https://leetcode.com/problems/merge-two-sorted-lists/">21. Merge Two Sorted Lists</a>
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        }
        if (list1.val > list2.val) {
            var tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        ListNode result = list1;

        while (list1.next != null && list2 != null) {
            if (list1.val < list2.val && list1.next.val < list2.val) {
                list1 = list1.next;
            } else {
                var tail1 = list1.next;
                var tail2 = list2.next;
                list1.next = list2;
                list2.next = tail1;
                list2 = tail2;
            }
        }
        if (list1.next == null) {
            if (list1.val <= list2.val) {
                list1.next = list2;
            } else {
                var tail2 = list2.next;
                list2.next = list1;
                list1.next = tail2;
            }
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