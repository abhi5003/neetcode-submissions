class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:

        nums.sort()
        res = []
        n = len(nums)

        for i in range(n):
            # Skip duplicate i
            if i > 0 and nums[i] == nums[i - 1]:
                continue

            for j in range(i + 1, n):
                # Skip duplicate j
                if j > i + 1 and nums[j] == nums[j - 1]:
                    continue

                left = j + 1
                right = n - 1

                while left < right:
                    curr_sum = nums[i] + nums[j] + nums[left] + nums[right]

                    if curr_sum < target:
                        left += 1

                    elif curr_sum > target:
                        right -= 1

                    else:
                        res.append([nums[i], nums[j], nums[left], nums[right]])

                        left += 1
                        right -= 1

                        # Skip duplicate left values
                        while left < right and nums[left] == nums[left - 1]:
                            left += 1

                        # Skip duplicate right values
                        while left < right and nums[right] == nums[right + 1]:
                            right -= 1

        return res
