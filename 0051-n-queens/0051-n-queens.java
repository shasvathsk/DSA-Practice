class Solution {
    List<List<String>> res=new ArrayList<>();
    char board[][];
    Set<Integer> col=new HashSet<>();
    Set<Integer> posdiag=new HashSet<>();
    Set<Integer> negdiag=new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        backtracking(0,n);
        return res;
    }
    void backtracking(int r,int n){
        if(r==n){
            List<String> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(new String(board[i]));
            }
            res.add(l);
            return;
        }
        for(int c=0;c<n;c++){
            if(!(col.contains(c)||posdiag.contains(r+c)||negdiag.contains(r-c))){
                board[r][c]='Q';
                col.add(c);
                posdiag.add(r+c);
                negdiag.add(r-c);
                backtracking(r+1,n);
                board[r][c]='.';
                col.remove(c);
                posdiag.remove(r+c);
                negdiag.remove(r-c);
            }
        }
    }
}