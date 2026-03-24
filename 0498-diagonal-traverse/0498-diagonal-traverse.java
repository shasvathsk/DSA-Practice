class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
         List<List<Integer>> a=new ArrayList<>();
         
         int m=mat.length;
         int n=mat[0].length;
         int x=m+n-1;
         int[] res=new int[m*n];
         int z=0;
         for(int i=0;i<=x;i++){
                a.add(new ArrayList<>());
         }
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a.get(i+j).add(mat[i][j]);
            }
         }
         for(int i=0;i<=x;i++){
            if(i%2==0){
                Collections.reverse(a.get(i));
                for(int j:a.get(i)){
                    res[z++]=j;
                }
            }else{
                for(int j:a.get(i)){
                    res[z++]=j;
                }
            }
         }
         System.out.print(a);
         return res;
    }
}