class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int buy = prices[0];
        int max = 0;

        for (int i = 1; i < n; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] > buy) {
                max = Math.max(max, prices[i] - buy);
            }
        }

        return max;
    }
}
