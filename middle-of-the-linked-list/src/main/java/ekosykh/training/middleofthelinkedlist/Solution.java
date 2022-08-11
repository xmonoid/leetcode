package ekosykh.training.middleofthelinkedlist;

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
class Solution {
    /**
     * Given the {@code head} of a singly linked list, return the <i>middle node of the linked list</i>.
     * <p/>
     * If there are two middle nodes, return <b>the second middle</b> node.
     * <p/>
     * <b>Constraints:</b>
     * <ul>
     *     <li>The number of nodes in the list is in the range {@code [1, 100]}.</li>
     *     <li>{@code 1 <= Node.val <= 100}</li>
     * </ul>
     */
    public static ListNode middleNode(ListNode head) {
        var middle = head;
        var second = true;
        while (head != null) {
            head = head.next;
            second = !second;
            if (second) {
                middle = middle.next;
            }
        }
        return middle;
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