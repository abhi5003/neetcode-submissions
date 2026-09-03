class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        return Arrays.stream(nums).anyMatch(x -> !set.add(x));
    }
}