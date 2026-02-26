class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0;
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                
                c=0;
            }
            else c++;
            if(c>max)max=c;
        }
        return max;
    }
}