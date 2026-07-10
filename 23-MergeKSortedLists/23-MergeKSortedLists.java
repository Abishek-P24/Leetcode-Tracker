// Last updated: 7/10/2026, 9:49:10 AM
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a,b) -> a.val - b.val);
        for (ListNode n : lists)
            if (n != null) pq.offer(n);
        ListNode d = new ListNode(0), cur = d;
        while (!pq.isEmpty()) {
            ListNode n = pq.poll();
            cur.next = n;
            cur = cur.next;
            if (n.next != null)
                pq.offer(n.next);
        }
        return d.next;
    }
}