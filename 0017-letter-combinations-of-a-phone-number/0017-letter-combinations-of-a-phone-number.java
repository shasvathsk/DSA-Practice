class Solution {
   static  HashMap<Character,String> h;
    static List<String> res;
            public static void f(String digits,StringBuilder path,int ind){
                if(ind==digits.length()){
                    res.add(path.toString());
                    return ;
                }
                String x=h.get(digits.charAt(ind));
                for(char c: x.toCharArray()){
                    path.append(c);
                    f(digits,path,ind+1);
                    path.deleteCharAt(path.length()-1);
                }
        }
    public List<String> letterCombinations(String digits) {
        h=new HashMap<>();
        h.put('2',"abc");
        h.put('3',"def");
        h.put('4',"ghi");
        h.put('5',"jkl");
        h.put('6',"mno");
        h.put('7',"pqrs");
        h.put('8',"tuv");
        h.put('9',"wxyz");
        int n=digits.length();
        res=new ArrayList<>();
        if(n==0)return res;
        f(digits,new StringBuilder(),0);
        return res;
    }
}