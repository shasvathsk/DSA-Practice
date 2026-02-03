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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null){
            return head;
        }
        int c=1;
        ListNode l=head;
        while(l.next!=null){
            l=l.next;
            c++;
        }
        k=k%c;
        for(int i=0;i<k;i++){
            ListNode t=head;
            ListNode  prev=t;
            while(t.next!=null){
                prev=t;
                t=t.next;
               
            }
            prev.next=null;
            t.next=head;
            head=t;
        }
        return head;
    }
}