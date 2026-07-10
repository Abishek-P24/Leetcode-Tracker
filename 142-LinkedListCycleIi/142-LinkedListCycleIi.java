// Last updated: 7/10/2026, 9:46:27 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(a!=null&&a.next!=null){
            a=a.next.next;
            b=b.next;
            if(a==b){
                ListNode c=head;
                while(c!=a){
                    c=c.next;
                    a=a.next;
                }
                return c;
            }
        }
        return null;
    }
}