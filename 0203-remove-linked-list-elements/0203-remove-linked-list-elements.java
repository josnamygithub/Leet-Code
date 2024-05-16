public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }

        while (head != null && head.val == val) {
            head = head.next; 
        }

        ListNode curNode = head;
        ListNode prev = null;
        while (curNode != null) {
            if (curNode.val == val) {
                if (prev == null) {
                    head = curNode.next; 
                } else {
                    prev.next = curNode.next;
                }
            } else {
                prev = curNode;
            }
            curNode = curNode.next;
        }

        return head;
    }
}
