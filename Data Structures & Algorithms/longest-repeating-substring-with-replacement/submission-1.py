class Solution:
    def characterReplacement(self, s: str, k: int) -> int:
        unique_char, res = set(), 0

        for c in s:
            unique_char.add(c)

        for c in unique_char:
            count, l = 0, 0

            for r in range(len(s)):
                if c == s[r]:
                    count += 1

                while (r - l + 1) - count > k:
                    if s[l] == c:
                        count -= 1
                    l += 1
                    
                res = max(res, r - l + 1)

        return res
