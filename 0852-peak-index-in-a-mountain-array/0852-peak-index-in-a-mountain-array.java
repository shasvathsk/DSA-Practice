class Solution {
    // public int peakIndexInMountainArray(int[] arr) {
    //     int s=0,l=arr.length-1,mid=0;
    //     while(s<=l){
    //         mid=(s+l)/2;
    //         if((arr[mid+1]<arr[mid]) && (arr[mid-1]<arr[mid])){
    //             return mid;
    //         }
    //         else if((arr[mid+1]<arr[mid]) && (arr[mid-1]>arr[mid])){
    //            l=mid-1;
    //         }
    //         else{
    //             s=mid+1;
    //         }
    //     }
    //     return mid;
    // }
// }

public int peakIndexInMountainArray(int[] arr) {
        int s=1,l=arr.length-2,mid=0;
        while(s<=l){
            mid=(s+l)/2;
            if((arr[mid+1]<arr[mid]) && (arr[mid-1]<arr[mid])){
                return mid;
            }
            else if (arr[mid-1]<arr[mid]){
               s=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return mid;
    }}