class Solution {
    public int minCost(int[][] costs) {
        if(costs.length == 0){ return 0; }
        int[][] dp = costs;
        for(int i = 1; i < dp.length; i++){
            dp[i][0] += dp[i-1][1] < dp[i-1][2] ? dp[i-1][1] : dp[i-1][2];
            dp[i][1] += dp[i-1][0] < dp[i-1][2] ? dp[i-1][0] : dp[i-1][2];
            dp[i][2] += dp[i-1][1] < dp[i-1][0] ? dp[i-1][1] : dp[i-1][0];
        }
        int ans = dp[dp.length-1][0] < dp[dp.length-1][1] ? dp[dp.length-1][0] : dp[dp.length-1][1];
        ans = ans < dp[dp.length-1][2] ? ans : dp[dp.length-1][2];
        return ans;
    }
}
