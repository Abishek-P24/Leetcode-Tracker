// Last updated: 7/10/2026, 9:48:18 AM
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode cur = head;
        int n = 1;
        while (cur.next != null) {
            cur = cur.next;
            n++;
        }
        cur.next = head;
        k %= n;
        for (int i = 0; i < n - k; i++)
            cur = cur.next;
        head = cur.next;
        cur.next = null;
        return head;
    }
}