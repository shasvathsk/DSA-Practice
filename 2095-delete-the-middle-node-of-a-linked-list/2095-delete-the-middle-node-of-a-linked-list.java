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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){
            return null;
        }
        ListNode s=head;
        ListNode f=head.next;
        while(f.next!=null && f.next.next!=null){
            s=s.next;
            f=f.next.next;
        }
        s.next=s.next.next;
        return head;


        // if(head.next==null){
        //     return null;
        // }                        MAM
        // ListNode s=head;
        // ListNode f=head;
        // ListNode t=null;
        // while(f!=null && f.next!=null){
        //     t=s;
        //     s=s.next;
        //     f=f.next.next;
        // }
        // t.next=t.next.next;
        // return head;
    }
}