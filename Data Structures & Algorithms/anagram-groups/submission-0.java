class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String original = strs[i];
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);

            String newStr = new String(ch);

            if (!map.containsKey(newStr)) {
                List<String> newList = new ArrayList<>();
                newList.add(original);

                map.put(newStr, newList);
            } else {
                List<String> existingList = map.get(newStr);
                existingList.add(original);
                map.put(newStr, existingList);
            }
        }

        List<List<String>> res = new ArrayList<>();

        for (Map.Entry<String, List<String>> et : map.entrySet()) {
            res.add(et.getValue());
        }

        return res;
    }
}
