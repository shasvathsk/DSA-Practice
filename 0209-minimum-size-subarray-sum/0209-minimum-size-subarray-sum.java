class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int sum=0;
        // int k=1;
        // int n=nums.length;
        // for(int i=0;i<k;i++){
        //     sum+=nums[i];
        // }
        // int min=k;
        // while(k<n){
        // if(sum==target)return k;
        // for(int i=1;i<n-k+1;i++){
        //     sum=sum+nums[i+k-1]-nums[i-1];
        //     if(sum==target){
        //         return k;
        //     }
        // }k++;}
        // return 0;
        
        int min=nums.length;
        int sum=0;
        int s=0;
        if(nums[s]>=target){
            min=1;
        }
        sum=nums[s];
        for(int l=1;l<nums.length;l++){
            sum=sum+nums[l];
            while(sum>=target){
                if((l-s+1)<min){
                    min=l-s+1;
                }
                sum=sum-nums[s];
                s++;
            }
        }
        if(s==0 && sum<target)
        return 0;
        else
        return min;
    }
}