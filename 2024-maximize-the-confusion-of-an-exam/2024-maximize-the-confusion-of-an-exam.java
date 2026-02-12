class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        // int t=0;
        // int f=0;
        // int max=1;
        // int s=0,li=1;
        // int n=answerKey.length();
          
        // if(answerKey.charAt(s)=='T')t++;
        // else f++;
        // if(n<=2)
        // return n;
        // if(answerKey.charAt(li)=='F')f++;
        // else t++;
        // int l=1;
        // li++;
        // if(answerKey.charAt(li)=='T')t++;
        // if(answerKey.charAt(li)=='F')f++;
        // while(li<n){
        //     if((t>f && f==k)||(f>t &&t==k)){
        //         l=li-s+1;
        //         if(l>max)max=l;
        //         li++;
        //         if(li<n){
        // if(answerKey.charAt(li)=='T')t++;
        // if(answerKey.charAt(li)=='F')f++;}
        //     }
        //     else{
        //         if(answerKey.charAt(s)=='T')t--;
        //         if(answerKey.charAt(s)=='F')f--;
        //         s++;
        //     }

        // }
        // return max;


        int s=0;
        int t=0,f=0;
        int n=answerKey.length(),len=1,max=len;
        for(int l=0;l<n;l++){
         if(answerKey.charAt(l)=='T')t++;
         else f++;
         
         System.out.println(t+" "+f);
         while(Math.min(t,f)>k){
            if(answerKey.charAt(s)=='T')t--;
            else f--;
            s++;
            System.out.println(t+" "+f);
         }
         len=l-s+1;
         if(len>max)max=len;
        }
        return max;
    }
}