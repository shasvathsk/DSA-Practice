class Solution {
    public int search(int[] nums, int target) {
        int s=0,l=nums.length-1,mid=0;
        int ind=0;
        int c=0;
        while(s<=l){
            mid=(s+l)/2;
            if(nums[mid]==target){
                c=1;
                ind = mid;
                return mid;
            }
            else if(target>nums[mid]){
                s=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        if(c!=0)
        return ind;
        else 
        return -1;
    }
}