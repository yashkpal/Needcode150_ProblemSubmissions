class Solution {
    public int maxProfit(int[] prices) {
        int[][] dp = new int[prices.length][2];
        dp[0][0] = prices[0];
        dp[prices.length-1][1] = prices[prices.length-1];
        for(int i=1;i< prices.length;i++){
            dp[i][0] = Math.min(dp[i-1][0], prices[i]);
            dp[prices.length-i-1][1] = Math.max(prices[prices.length-i-1],dp[prices.length-i][1]);
        }

        int rs = 0;
        for(int i=0;i<dp.length;i++){
            rs = Math.max(rs, dp[i][1]-dp[i][0]);
        }
        return rs;
    }
}
