class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chArray = s.toCharArray();
            Arrays.sort(chArray);
            String sortedS = new String(chArray);
            map.putIfAbsent(sortedS, new ArrayList<>());
            map.get(sortedS).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
