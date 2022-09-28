class Solution {
    public int climbStairs(int n) {
        // if(n==0){
        //     return 1;
        // }
        // if(n==1){
        //     return 1;
        // }
        // int left=climbStairs(n-1);
        // int right=climbStairs(n-2);
        // return left + right;
        int []dp=new int[n+1];
        Arrays.fill(dp,-1);
        int x=solve(n,dp);
        return x;
    }
    
    public static int solve(int n,int[]dp){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }
        if(dp[n]!=-1)return dp[n];
        return dp[n]=solve(n-1,dp)+solve(n-2,dp);
        
    }
}