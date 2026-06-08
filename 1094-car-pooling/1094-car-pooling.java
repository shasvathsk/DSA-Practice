class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] df=new int[1001];
        for(int i=0;i<trips.length;i++){
            int s=trips[i][1];
            int e=trips[i][2];
            int val=trips[i][0];
            df[s]+=val;
            df[e]-=val;
        }
        int[] ans=new int[1001];
        ans[0]=df[0];
        for(int i=1;i<1001;i++){
            ans[i]=ans[i-1]+df[i];
        }
        for(int i=0;i<ans.length;i++){
            if(ans[i]>capacity){
                return false;
            }
        }
        return true;
    }
}