// Last updated: 7/10/2026, 9:42:34 AM
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            ListNode nxt = cur.next;
            int g = gcd(cur.val, nxt.val);
            ListNode node = new ListNode(g);
            cur.next = node;
            node.next = nxt;
            cur = nxt;
        }
        return head;
    }
    int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}