// Last updated: 7/10/2026, 9:45:27 AM
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode a = new ListNode(0);
        a.next = head;

        ListNode cur = a;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }

        return a.next;
    }
}