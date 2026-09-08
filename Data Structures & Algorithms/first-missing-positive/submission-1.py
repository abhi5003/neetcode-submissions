from typing import List

class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:
        i, n = 0, len(nums)

        while i < n:
            # The correct index for the number nums[i] is nums[i] - 1
            correct_idx = nums[i] - 1
            
            # 1. Use 'and' instead of '&'
            # 2. Check if correct_idx is within valid array bounds (0 to n-1)
            if 0 < nums[i] <= n and nums[i] != nums[correct_idx]:
                ## swap
                temp = nums[i]
                nums[i] = nums[correct_idx]
                nums[correct_idx] = temp
            else:
                i += 1

        # Find the first index out of place
        for j in range(n):
            if nums[j] != j + 1:
                return j + 1

        return n + 1
