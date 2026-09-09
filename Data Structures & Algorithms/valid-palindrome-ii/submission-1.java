class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                // escaping either of charector when mismatch 
                return isPal(s.substring(0, l) + s.substring(l + 1))
                    || isPal(s.substring(0, r) + s.substring(r + 1));
            }

            l++;
            r--;
        }

        return true;
    }

    private boolean isPal(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }
}