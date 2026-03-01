class Solution {
    public int minimumOR(int[][] grid) {
        int X = 0;

        for (int[] row : grid) {
            for (int v : row) {
                X |= v;
            }
        }

        for (int b = 17; b >= 0; b--) {
            if ((X & (1 << b)) == 0) continue;

            int candidate = X ^ (1 << b);

            if (feasible(grid, candidate)) {
                X = candidate;
            }
        }

        return X;
    }

    private boolean feasible(int[][] grid, int X) {
        for (int[] row : grid) {
            boolean ok = false;

            for (int v : row) {
               
                if ((v | X) == X) {
                    ok = true;
                    break;
                }
            }

            if (!ok) return false;
        }
        return true;
    }
}
