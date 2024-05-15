public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Handle empty list gracefully
        if (head == null) {
            return head;
        }

        // Separate logic for handling head node removal
        while (head != null && head.val == val) {
            head = head.next; // Remove head nodes with the value
        }

        // Traverse and remove nodes with the given value
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            if (current.val == val) {
                // Remove the current node
                if (prev == null) {
                    head = current.next; // Update head if removing head node
                } else {
                    prev.next = current.next;
                }
            } else {
                // Keep track of the previous node for deletion
                prev = current;
            }
            current = current.next;
        }

        return head;
    }
}
