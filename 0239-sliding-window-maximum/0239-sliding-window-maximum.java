class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] res = new int[n - k + 1];
        
        Deque<Integer> dq = new ArrayDeque<>();
        int idx = 0;

        for(int i = 0; i < n; i++){

            // remove elements outside window
            if(!dq.isEmpty() && dq.peekFirst() <= i - k){
                dq.pollFirst();
            }

            // remove smaller elements from back
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.pollLast();
            }

            // add current index
            dq.offerLast(i);

            // window formed
            if(i >= k - 1){
                res[idx++] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}