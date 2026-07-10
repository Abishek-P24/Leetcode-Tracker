// Last updated: 7/10/2026, 9:47:43 AM
class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {

            // Check if current node has duplicates
            if (curr.next != null && curr.val == curr.next.val) {

                // Skip all nodes with the same value
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }

                // Remove all duplicates
                prev.next = curr.next;

            } else {
                // Move prev only if current is unique
                prev = prev.next;
            }

            curr = curr.next;
        }

        return dummy.next;
    }
}