// Last updated: 7/10/2026, 9:45:25 AM
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
    public ListNode reverseList(ListNode head) {
        ListNode a=null;
        ListNode b=head;
        while(b!=null){
            ListNode c=b.next;
            b.next=a;
            a=b;
            b=c;
        }
        return a;
    }
}