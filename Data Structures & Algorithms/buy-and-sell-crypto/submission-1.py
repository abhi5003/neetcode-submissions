class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        buy, max_profit, n = prices[0], 0, len(prices)

        for i in range(1, n):
            if prices[i] < buy:
                buy = prices[i]
            elif prices[i] > buy:
                max_profit = max(max_profit, prices[i] - buy)

        return max_profit
