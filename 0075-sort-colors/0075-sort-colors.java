class Solution {
    public void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(mid<=h){
            if(nums[mid]==0){
                int t=nums[mid];
                nums[mid]=nums[l];
                nums[l]=t;
                   l++;
                  mid++;
            }else if( nums[mid]==2){
                int t=nums[mid];
                nums[mid]=nums[h];
                nums[h]=t;
                   h--;
            }else{
            mid++;}
         
        }
    
    }
}