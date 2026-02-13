class Solution {
    public int search(int[] nums, int target) {
//          int s=0,l=nums.length-1,mid=0;
//         int ind=0;
//         if(nums.length<=3){
//             for(int i=0;i<nums.length;i++){
//                 if(nums[i]==target){
//                     return i;
//                 }
//             }
//             return -1;
//         }


//         while(s<=l){
//             mid=(s+l)/2;
//             if(nums[mid]==target){
//                 return mid;
//             }
//             else if((target<=nums[s])&&(target>=nums[mid+1])){
//                 s=mid+1;
//             }
//             else{
//                 l=mid-1;
//             }
//         }
//         return -1;
//     }
// }


 int s=0,l=nums.length-1,mid=0;
        while(s<=l){
            mid=(s+l)/2;
            if(nums[mid]==target){
    
                return mid;
            }
            else if(nums[mid]>=nums[s]){
                if((target>=nums[s])&&(target<nums[mid])){
                l=mid-1;
                 }
                 else{
                    s=mid+1;
                 }}
            else{
                if((target>=nums[mid]) && (target <=nums[l])){
                     s=mid+1;
                }else{
                    l=mid-1;
                }
            }
        }
        return -1;
    }
    }