// Last updated: 7/10/2026, 9:43:48 AM

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b!=null && b.next!=null){
            a=a.next;
            b=b.next.next;
        }
        return a;
    }
}