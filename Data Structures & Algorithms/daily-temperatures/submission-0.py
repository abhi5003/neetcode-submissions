class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        n = len(temperatures)
        res = [0] * n
        st = []

        for curr_day in range(n):
            while st and temperatures[st[-1]] < temperatures[curr_day]:
                pre_idx = st.pop()
                res[pre_idx] = curr_day - pre_idx

            st.append(curr_day)

        return res

