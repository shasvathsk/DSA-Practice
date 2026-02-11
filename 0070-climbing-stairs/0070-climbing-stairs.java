class Solution {
     static int dp[];
    // int fib(int n){
    //     HashMap<Integer,Integer> map=new HashMap<>();
    //     if(n<=1)
    //     return n;
    //     if(map.containsKey(n))
    //     return map.get(n);
    //     map.put(n,fib(n-1)+fib(n-2));
    //     return map.get(n);
    // }

    static int lonfib(int n){
    if(n<=1)
    return n;
    if(dp[n]==-1){
      for(int i=2;i<=n;i++)
      dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
    
   
  }

public int climbStairs(int n) {
        // return fib(n+1);
    dp = new int[n+2];
    Arrays.fill(dp,-1);
    dp[0]=0;
    dp[1]=1;
    return lonfib(n+1);
    }
}