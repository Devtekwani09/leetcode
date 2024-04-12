class Solution {
    public int solve(int n, int i, int dp[]){
        if(i==n){
            return 1;
        }
        
        if(i>n){
            return 0;
        }
        
        if(dp[i] != -1){
            return dp[i];
        }
        
        dp[i] = (solve(n ,i+1, dp) + solve(n, i+2, dp));
        return dp[i];
    }

    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        for(int i=0; i<dp.length; i++){
            dp[i] = -1;
        }
        int ans = solve(n , 0, dp);
        return ans;
    }
}