class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        len1, len2 = len(s1), len(s2)

        if len1 > len2:
            return False

        count = [0] * 26
        for i in range(len1):
            count[ord(s1[i]) - ord("a")] += 1

        for i in range(len2):
            count[ord(s2[i]) - ord("a")] -= 1
            if i - len1 >= 0:
                count[ord(s2[i - len1]) - ord("a")] += 1

            if self.all_zero(count):
                return True

        return False

    def all_zero(self, count: List[int]) -> bool:
        for i in range(26):
            if count[i] != 0:
                return False
        return True
