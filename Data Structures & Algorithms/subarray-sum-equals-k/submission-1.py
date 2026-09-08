class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        res, curSum = 0, 0
        prefix_sum = {0: 1}

        for num in nums:
            curSum += num
            diff = curSum - k
            res += prefix_sum.get(diff, 0)
            prefix_sum[curSum] = 1 + prefix_sum.get(curSum, 0)
        return res
