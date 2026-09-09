class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();

        int n = Math.min(len1, len2);

        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i < n) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
        }

        if (len1 > len2) {
            sb.append(word1.substring(i));
        } else {
            sb.append(word2.substring(i));
        }

        return sb.toString();
    }
}