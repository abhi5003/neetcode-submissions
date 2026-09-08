class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n: int = len(nums)
        num_1 = -1
        num_2 = -1
        cnt_1 = 0
        cnt_2 = 0

        for i in nums:
            if i == num_1:
                cnt_1 += 1
            elif i == num_2:
                cnt_2 += 1
            elif cnt_1 == 0:
                cnt_1 = 1
                num_1 = i
            elif cnt_2 == 0:
                cnt_2 = 1
                num_2 = i
            else:
                cnt_1 -= 1
                cnt_2 -= 1
        
        cnt_1, cnt_2 = 0, 0

        for i in nums:
            if i == num_1:
                cnt_1 += 1
            if i == num_2:
                cnt_2 += 1

        res = []
        if cnt_1 > n // 3:
            res.append(num_1)
        if cnt_2 > n // 3:
            res.append(num_2)

        return res
