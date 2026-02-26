class Solution {
    public int minimumRecolors(String blocks, int k) {
        int l=k-1;
        int n=blocks.length();
        int min=k;
        while(l<n){
            int c=0;
            for(int s=l-k+1;s<=l;s++){
                if(blocks.charAt(s)=='W')
                c++;
                System.out.print(blocks.charAt(s));
            }
            System.out.println();
            if(c<min)
            min=c;
            l++;
        }
        return min;
    }
}