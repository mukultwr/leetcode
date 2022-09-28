class Solution {
    public int[] countBits(int n) {
     
        
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
       int arr[] = new int[n+1];
        for(int i=0;i<=n;i++) {
            arr[i] = solve(i,dp);
        }
        return arr;
        
    }
    public static int solve(int n,int []dp){
        if(n<=0){
            return 0;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=1 + solve(n- highestPowerof2(n),dp);
        
        
    }
    
    static int highestPowerof2(int x)
    {
       
        // check for the set bits
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x |= x >> 8;
        x |= x >> 16;
         
        // Then we remove all but the top bit by xor'ing the
        // string of 1's with that string of 1's shifted one to
        // the left, and we end up with just the one top bit
        // followed by 0's.
        return x ^ (x >> 1); 
     
    }
}