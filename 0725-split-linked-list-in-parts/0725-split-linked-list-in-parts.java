class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        int baseSize = length / k;
        int extra = length % k;
        ListNode[] result = new ListNode[k];
        curr = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = curr;
            int size = baseSize + (extra > 0 ? 1 : 0);
            extra--;
            for (int j = 0; j < size - 1; j++) {
                if (curr != null) curr = curr.next;
            }
            if (curr != null) {
                ListNode nextPart = curr.next;
                curr.next = null; 
                curr = nextPart;
            }
            result[i] = partHead;
        }
        return result;
    }
}
