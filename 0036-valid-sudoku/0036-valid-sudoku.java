class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row=new HashSet[9];
        HashSet<Character>[] col=new HashSet[9];
        HashSet<Character>[] grid=new HashSet[9];
        for(int i=0;i<9;i++){
            row[i]=new HashSet<>();
            col[i]=new HashSet<>();
            grid[i]=new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch=board[i][j];
                if(ch=='.')continue;

                if(row[i].contains(ch))return false;
                row[i].add(ch);
                if(col[j].contains(ch))return false;
                col[j].add(ch);
                int ind=(i/3)*3+(j/3);
                if(grid[ind].contains(ch)){
                    return false;
                }
                grid[ind].add(ch);
            }
        }
        return true;
    }
}