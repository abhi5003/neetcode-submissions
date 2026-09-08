class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        for (int i = 0; i < n; i++) {
            dp[i][0] = -1;
            dp[i][1] = -1;
        }
        return profitUtill(0, 0, n, prices, dp);
    }

    private int profitUtill(int i, int buyOrSell, int n, int[] prices, int[][] dp) {
        // base case
        // if not any day rest for trading
        if (i == n)
            return 0;

        if (dp[i][buyOrSell] != -1) {
            return dp[i][buyOrSell];
        }

        int profit = 0;

        if (buyOrSell == 0) {
            // having buying options on particuler day but nessacary on every buying day we
            // buy we also cannot buy

            profit = Math.max(0 + profitUtill(i + 1, 0, n, prices, dp),
                -prices[i] + profitUtill(i + 1, 1, n, prices, dp));
        }

        if (buyOrSell == 1) {
            profit = Math.max(0 + profitUtill(i + 1, 1, n, prices, dp),
                prices[i] + profitUtill(i + 1, 0, n, prices, dp));
        }

        dp[i][buyOrSell] = profit;

        return profit;
    }
}