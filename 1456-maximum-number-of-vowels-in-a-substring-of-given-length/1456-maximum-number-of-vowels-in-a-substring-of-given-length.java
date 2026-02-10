class Solution {
    public boolean vowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
    }
    public int maxVowels(String s, int k) {
        int c=0,n=s.length();
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                c++;
            }
        }
        int max=c;
        for(int i=1;i<n-k+1;i++){
            if(vowel(s.charAt(i-1))){
                c--;
            }
            if(vowel(s.charAt(i+k-1))){
                c++;
            }
            if(c>max)
            max=c;
        }
return max;
    }
}