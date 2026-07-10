// Last updated: 7/10/2026, 9:48:09 AM
class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];   
    }
}