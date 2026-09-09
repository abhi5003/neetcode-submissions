class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        len_1, len_2 = len(word1), len(word2)

        n = min(len_1, len_2)
        ans = ""

        i = 0
        while i < n:
            ans += word1[i]
            ans += word2[i]
            i += 1

        if len_1 > len_2:
            ans += word1[i::]
        else:
            ans += word2[i::]

        
        return ans
