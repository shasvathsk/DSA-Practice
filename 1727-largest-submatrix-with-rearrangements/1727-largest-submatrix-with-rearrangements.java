class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int n = matrix.length;
        int m=matrix[0].length;
        int[][] height =new int[n][m];

        for(int j=0;j<m;j++){
            height[0][j]=matrix[0][j];
            for(int i=1;i<n;i++){
                height[i][j]=matrix[i][j]==0? 0:height[i-1][j]+1;
            }
        }

        int maxarea=0;
        for(int i=0;i<n;i++){
            int[] row=height[i].clone();
            Arrays.sort(row);
            for(int j=0;j<m;j++){
                int h=row[m-1-j];
                maxarea=Math.max(maxarea,h*(j+1));
            }
        }
        return maxarea;
    }
}