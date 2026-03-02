class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<n;i++){
            dp[0][i]=1;
        }
        for(int i=0;i<m;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];

    }
}



// import java.util.*;

// public class RatInAMaze {
//     public List<String> findPaths(int[][] maze) {
//         List<String> result = new ArrayList<>();
//         int n = maze.length;
        
//         // Safety check: if start or end is a wall, no path exists
//         if (maze[0][0] == 0 || maze[n-1][n-1] == 0) {
//             return result;
//         }

//         backtrack(0, 0, n, maze, "", result);
//         return result;
//     }

//     private void backtrack(int r, int c, int n, int[][] maze, String path, List<String> result) {
//         // 1. BASE CASE: Reached the bottom-right corner
//         if (r == n - 1 && c == n - 1) {
//             result.add(path);
//             return;
//         }

//         // 2. EXPLORE OPTION 1: Move DOWN
//         // Check: Is the next row within bounds AND not a wall?
//         if (r + 1 < n && maze[r + 1][c] == 1) {
//             backtrack(r + 1, c, n, maze, path + "D", result);
//         }

//         // 3. EXPLORE OPTION 2: Move RIGHT
//         // Check: Is the next column within bounds AND not a wall?
//         if (c + 1 < n && maze[r][c + 1] == 1) {
//             backtrack(r, c + 1, n, maze, path + "R", result);
//         }
//     }

//     public static void main(String[] args) {
//         int[][] maze = {
//             {1, 0, 0, 0},
//             {1, 1, 0, 1},
//             {0, 1, 0, 0},
//             {1, 1, 1, 1}
//         };
//         RatInAMaze solver = new RatInAMaze();
//         System.out.println("All possible paths: " + solver.findPaths(maze));
//     }
// }