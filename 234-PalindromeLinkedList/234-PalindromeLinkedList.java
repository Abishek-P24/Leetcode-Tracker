// Last updated: 7/10/2026, 9:45:01 AM
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
    public boolean isPalindrome(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        while(b!=null&&b.next!=null){
            a=a.next;
            b=b.next.next;
        }
        ListNode c=null;
        while(a!=null){
            ListNode next=a.next;
            a.next=c;
            c=a;
            a=next;
        }
        while(c!=null){
            if(head.val!=c.val){
                return false;
            }
            head=head.next;
            c=c.next;
        }
        return true;
    }
}