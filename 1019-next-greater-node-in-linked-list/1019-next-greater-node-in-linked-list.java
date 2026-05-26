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
    public int[] nextLargerNodes(ListNode head) {
        // HashMap<ListNode,Integer> hm= new HashMap<>();
        // Stack<ListNode> st=new Stack<>();
        // ListNode c=head;
        // while(c!=null){
        //     if(st.empty()){
        //         st.push(c);
        //     }else{
        //         while(!st.empty() && st.peek().val<c.val){
        //             hm.put(st.pop(),c.val);
        //         }
        //         st.push(c);
        //     }
        //     c=c.next;
        // }
        // while(!st.empty()){
        //     hm.put(st.pop(),0);
        // }
        // c=head;
        // int[] arr=new int[hm.size()];
        // int i=0;
        // while(c!=null){
        //     arr[i++]=hm.get(c);
        //     c=c.next;
        // }
        // return arr;
        


        //MAM
        ArrayList<Integer> ar=new ArrayList<>();
        ListNode c=head;
        Stack<Integer> st=new Stack<>();
        while(c!=null){
            ar.add(c.val);
            c=c.next;
        }
        int[] a=new int[ar.size()];
        for(int i=ar.size()-1;i>=0;i--){
            int x=ar.get(i);
            while(!st.empty() && x>=st.peek()){
                st.pop();
            }
              if(st.empty()){
                a[i]=0;
            }
            else{
                a[i]=st.peek();
            }
            st.push(x);
        }
        
        return a;

    }
}