class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum=0;
        int c=0;
        int avg=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
        sum=sum+arr[i];}
        if(sum>=threshold*k){
            c++;
         }
        for(int i=1;i<n-k+1;i++){
         sum=sum+arr[i+k-1]-arr[i-1];
         if((sum)>=threshold*k){
            c++;
         }
         
        }
          return c; 
         }
}