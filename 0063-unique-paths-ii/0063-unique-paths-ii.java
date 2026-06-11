class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         int[][] dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0]=1;
        if(obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1 || obstacleGrid[0][0]==1){
            return 0;
        }
        int n=obstacleGrid[0].length;
        int m=obstacleGrid.length;
        for(int i=1;i<n;i++){
            if(obstacleGrid[0][i]==0)
            dp[0][i]=dp[0][i-1];
        }
        for(int i=1;i<m;i++){
            if(obstacleGrid[i][0]==0)
            dp[i][0]=dp[i-1][0];
        }

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
            if(obstacleGrid[i][j]==0)
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            
            }
        }
        if(dp[m-1][n-1]==0)return 0;
        return dp[m-1][n-1];

    }
}