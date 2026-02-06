class Solution {
    public int longestSubarray(int[] nums) {
        int left=0;
        int z=0;
        int maxl=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                z++;
            }

            while(z>1){
                if(nums[left]==0){
                    z--;
                }
                left++;
            }
            maxl=Math.max(maxl,right-left);
        }
        return maxl;
    }
}