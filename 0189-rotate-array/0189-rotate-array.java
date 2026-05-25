class Solution {



    // void rotleft(int[] nums,int i){
    //         int temp=nums[i];
    //         for(int l=i;l<nums.length-1;l++){
    //             nums[l]=nums[l+1];
    //         }
    //         nums[nums.length-1]=temp;
    // }




    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int m=0;
        int[] newl=new int[n];
        if(n>1)
       { 
        k=k%n;
        for(int i=n-k;i<n;i++){
            newl[m++]=nums[i];
        }
        for(int i=0;i<n-k;i++){
            newl[m++]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=newl[i];
        }}



        // k=k%n;
        // for(int i=0;i<k;i++){
        //     int temp=nums[n-1];
        //     for(int j=n-1;j>0;j--){
        //         nums[j]=nums[j-1];
        //     }
        //     nums[0]=temp;
        // }



        
    //     if(n!=1 && k<n){
    //     int i=k-1;
    //     int j=n-1;
    //     for(i=k-1,j=n-1;i>=0&&j>=n-k;i--,j--){
    //             int t=nums[i]; 
    //            nums[i]=nums[j];
    //            nums[j]=t;

    //     }
    //     System.out.println(j);
    //     if(n%2!=0)
    //     rotleft(nums,j);
    // }
    
    

    
    }
}