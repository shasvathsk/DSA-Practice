class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<>();
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            if(!st.empty() && (s.charAt(i)=='B'&&st.peek()=='A'||(s.charAt(i)=='D'&&st.peek()=='C'))){
                st.pop();
                c--;
            }
            else{
            st.push(s.charAt(i));
            c++;}
        }
        return c;
    }
}