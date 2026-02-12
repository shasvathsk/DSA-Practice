class Solution {
    public int removeElement(int[] nums, int val) {
    //     int  k = 0;
    // for (int i=0;i<nums.length;i++){
    //     if (nums[i] != val){
    //         nums[k] = nums[i];
    //         k += 1;}}
    // return k;

     int n=nums.length;
   int s=0;
   int l=0;
   while(l<n){
    if(nums[l]!=val){
        nums[s++]=nums[l];
        l++;
    }else{
        l++;
    }
   }
return s;
    }
    }

    
