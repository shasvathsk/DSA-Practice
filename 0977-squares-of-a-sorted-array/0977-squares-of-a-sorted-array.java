class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] s=new int[n];
        s[0]=nums[0]*nums[0];
        for(int i=1;i<n;i++){
            s[i]=nums[i]*nums[i];
            }
            Arrays.sort(s);
            return s;
        }
       
    }
