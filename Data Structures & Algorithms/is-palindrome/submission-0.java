class Solution {
    public boolean isPalindrome(String s) {
        String str = phraseFormater(s);
        int n = str.length();
        return IntStream.range(0, n / 2)
                .allMatch(i -> str.charAt(i) == str.charAt(n - 1 - i));
    }

    private String phraseFormater(String s) {
        return s.chars().filter(Character::isLetterOrDigit)
                .mapToObj(i -> (char) i)
                .map(Character::toLowerCase)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}