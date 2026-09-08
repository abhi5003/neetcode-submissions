class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        n = len(prices)
        dp = {}  # Using a hash map instead of a 2D grid

        def profitUtill(i, buyOrSell):
            if i == n:
                return 0

            # Using the tuple (i, buyOrSell) as the cache key
            if (i, buyOrSell) in dp:
                return dp[(i, buyOrSell)]

            if buyOrSell == 0:
                profit = max(profitUtill(i + 1, 0), -prices[i] + profitUtill(i + 1, 1))
            else:
                profit = max(profitUtill(i + 1, 1), prices[i] + profitUtill(i + 1, 0))

            dp[(i, buyOrSell)] = profit  # Memoize using the tuple key
            return profit

        return profitUtill(0, 0)
