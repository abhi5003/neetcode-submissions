class Solution:
    def validPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1

        while left < right:
            if s[left] != s[right]:
                # Remove the character at left
                skip_left = s[:left] + s[left + 1:]

                # Remove the character at right
                skip_right = s[:right] + s[right + 1:]

                return (
                    self.isPalindrome(skip_left)
                    or self.isPalindrome(skip_right)
                )

            left += 1
            right -= 1

        return True

    def isPalindrome(self, s: str) -> bool:
        left, right = 0, len(s) - 1

        while left < right:
            if s[left] != s[right]:
                return False

            left += 1
            right -= 1

        return True

