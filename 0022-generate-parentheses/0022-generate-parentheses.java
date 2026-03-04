class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        back(n,res,"",0,0);
        return res;
    }
    void back(int n,List<String> res,String c,int open,int close){
        if(c.length()==n*2){
            res.add(c);
            return;
        }
        if(open<n){
            back(n,res,c+"(",open+1,close);
        }
        if(close<open){
            back(n,res,c+")",open,close+1);
        }
    }
}